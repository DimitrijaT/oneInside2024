package org.example.core.impl;

import org.example.core.IRestaurantSystem;
import org.example.model.MenuItem;
import org.example.model.Order;
import org.example.service.IMenuService;
import org.example.service.IOrderService;

import java.time.LocalDate;
import java.util.List;

public class RestaurantSystemImpl implements IRestaurantSystem {

    private final IMenuService menuService;

    private final IOrderService orderService;


    public RestaurantSystemImpl(IMenuService menuService, IOrderService orderService) {
        this.menuService = menuService;
        this.orderService = orderService;
    }

    @Override
    public List<MenuItem> getMenu() {
        return menuService.getMenu();
    }


    private StringBuilder printOrders(List<Order> orders) {
        StringBuilder sb = new StringBuilder();
        if (orders.isEmpty()) {
            sb.append("No Orders Found!");
        }
        for (Order order : orders) {
            sb.append(order).append(System.lineSeparator());
        }
        return sb;
    }

    @Override
    public String printAllOrders() {
        List<Order> orders = orderService.getAllOrders();
        return printOrders(orders).toString();
    }

    @Override
    public String printOrdersForDay(LocalDate date) {
        List<Order> orders = orderService.getOrdersOnDate(date);
        StringBuilder sb = printOrders(orders);
        sb.append(String.format("Total earnings from all orders: %.4f", getTotalEarningsForDay(date)));
        return sb.toString();
    }

    @Override
    public Double getTotalEarningsForDay(LocalDate day) {
        return orderService.getTotalEarningsForDay(day);
    }

    @Override
    public void addItemToMenu(MenuItem item) {
        menuService.addMenuItem(item);
    }

    @Override
    public void processOrder(Order order) {
        orderService.addOrder(order);
    }
}
