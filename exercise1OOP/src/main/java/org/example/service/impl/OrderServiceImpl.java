package org.example.service.impl;

import org.example.model.Order;
import org.example.repository.IOrderRepository;
import org.example.service.IOrderService;

import java.time.LocalDate;
import java.util.List;

public class OrderServiceImpl implements IOrderService {

    private final IOrderRepository orderRepository;

    public OrderServiceImpl(IOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public boolean addOrder(Order order) {
        orderRepository.addOrder(order);
        return true;
    }

    @Override
    public boolean removeOrder(Long id) {
        orderRepository.removeOrder(id);
        return true;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @Override
    public List<Order> getOrdersOnDate(LocalDate date) {
        return orderRepository.getOrdersForDay(date);
    }

    @Override
    public Double getTotalEarningsForDay(LocalDate date) {
        double total = 0.0;
        List<Order> orders = orderRepository.getOrdersForDay(date);
        for (Order order : orders) {
            total += order.getTotalOrderEarnings();
        }
        return total;
    }

}
