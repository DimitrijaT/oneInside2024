package org.example.service;

import org.example.model.Order;

import java.time.LocalDate;
import java.util.List;

public interface IOrderService {

    boolean addOrder(Order order);

    boolean removeOrder(Long Id);

    List<Order> getAllOrders();

    List<Order> getOrdersOnDate(LocalDate date);

    Double getTotalEarningsForDay(LocalDate date);


}
