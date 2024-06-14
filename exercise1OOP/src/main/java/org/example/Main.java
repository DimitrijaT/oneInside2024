package org.example;

import org.example.core.RestaurantFactory;
import org.example.core.impl.RestaurantSystemImpl;
import org.example.model.*;
import org.example.model.enumeration.FoodCategory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RestaurantSystemImpl r1 = RestaurantFactory.createRestaurant();

        MenuItem soda = new Beverage("Soda", "Refreshing drink", 5.2);
        MenuItem cocaCola = new Beverage("Coca Cola", "Refreshing drink", 3.0);
        MenuItem burger = new Food("McDonaldBurger", "Tasty burger", 15.0, FoodCategory.MAIN);

        r1.addItemToMenu(soda);
        r1.addItemToMenu(cocaCola);
        r1.addItemToMenu(burger);

        List<OrderMenuItem> orderMenuItemList = new ArrayList<>();
        orderMenuItemList.add(new OrderMenuItem(soda, 5));
        orderMenuItemList.add(new OrderMenuItem(burger, 3));
        Order order0 = new Order(orderMenuItemList, 5.6);

        List<OrderMenuItem> orderMenuItemList2 = new ArrayList<>();
        orderMenuItemList2.add(new OrderMenuItem(soda, 5));
        Order order1 = new Order(orderMenuItemList2, 0.5);

        r1.processOrder(order0);
        r1.processOrder(order1);

        r1.

        System.out.println(r1.printOrdersForDay(LocalDate.parse("2024-06-14")));
    }
}