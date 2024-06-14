package org.example.repository.impl;

import org.example.model.Order;
import org.example.repository.IOrderRepository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class OrderRepositoryImpl implements IOrderRepository {


    // index by date ordered by time
    Map<LocalDate, TreeSet<Order>> ordersByDate;

    // index by id
    Map<Long, Order> ordersById;


    public OrderRepositoryImpl() {
        ordersByDate = new HashMap<>();
        ordersById = new HashMap<>();
    }

    @Override
    public boolean addOrder(Order order) {
        ordersByDate.putIfAbsent(order.getTimeOfOrder().toLocalDate(), new TreeSet<>());
        ordersByDate.get(order.getTimeOfOrder().toLocalDate()).add(order);

        ordersById.putIfAbsent(order.getId(), order);
        return true;
    }

    @Override
    public boolean removeOrder(Long id) {
        ordersByDate.get(ordersById.get(id).getTimeOfOrder().toLocalDate()).remove(ordersById.get(id));
        ordersById.remove(id);
        return true;
    }

    @Override
    public List<Order> getOrdersForDay(LocalDate day) {
        return ordersByDate.get(day).stream().toList();
    }

    @Override
    public List<Order> getAllOrders() {
        return ordersById.values().stream().toList();
    }
}
