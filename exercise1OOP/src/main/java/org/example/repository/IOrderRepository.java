package org.example.repository;

import org.example.model.Order;

import java.time.LocalDate;
import java.util.List;

public interface IOrderRepository {
    boolean addOrder(Order order);

    boolean removeOrder(Long id);

    List<Order> getOrdersForDay(LocalDate day);

    List<Order> getAllOrders();
}
