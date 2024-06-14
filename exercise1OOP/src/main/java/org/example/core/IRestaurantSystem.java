package org.example.core;

import org.example.model.MenuItem;
import org.example.model.Order;

import java.time.LocalDate;
import java.util.List;

public interface IRestaurantSystem {

    List<MenuItem> getMenu();

    String printAllOrders();

    String printOrdersForDay(LocalDate day);

    Double getTotalEarningsForDay(LocalDate day);

    void addItemToMenu(MenuItem item);

    void processOrder(Order order);

}
