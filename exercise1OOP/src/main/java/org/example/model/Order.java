package org.example.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order implements Comparable<Order> {
    private Long id;
    private LocalDateTime timeOfOrder;

    // id / quantity
    private List<OrderMenuItem> orderedMenuItems;
    private Double tippedAmount;

    public Long getId() {
        return id;
    }

    public LocalDateTime getTimeOfOrder() {
        return timeOfOrder;
    }

    public List<OrderMenuItem> getMenuItems() {
        return orderedMenuItems;
    }

    public Double getTippedAmount() {
        return tippedAmount;
    }

    public Double getTotalOrderBalance() {
        return getTotalOrderEarnings() + tippedAmount;
    }

    public Double getTotalOrderEarnings() {
        return orderedMenuItems.stream()
                .mapToDouble(orderMenuItem -> (orderMenuItem.getItem().getPrice() -
                        (orderMenuItem.getItem().getTaxPercentage() * orderMenuItem.getItem().getPrice()))
                        * orderMenuItem.getQuantity())
                .sum();
    }


    @Override
    public int compareTo(Order o) {
        return this.timeOfOrder.compareTo(o.timeOfOrder);
    }

    public Order(List<OrderMenuItem> orderedMenuItems, Double tippedAmount) {
        this.id = (long) (Math.random() * Long.MAX_VALUE);
        this.timeOfOrder = LocalDateTime.now();
        this.orderedMenuItems = orderedMenuItems;
        this.tippedAmount = tippedAmount;
    }

    @Override
    public String toString() {
        int tabs = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("=========ORDER=========\n");
        sb.append(String.format("ID#%d\n", id));
        for (OrderMenuItem orderedItem : getMenuItems()) {
            sb.append(orderedItem.printMenuItem(tabs));
        }
        sb.append(String.format("Tipped Amount: %.2f$\n", getTippedAmount()));
        sb.append(String.format("Total Order Balance: %.2f\n", getTotalOrderBalance()));
        sb.append("========================\n");
        return sb.toString();
    }
}
