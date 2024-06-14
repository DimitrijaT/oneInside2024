package org.example.core;

import org.example.core.impl.RestaurantSystemImpl;
import org.example.repository.impl.MenuRepositoryImpl;
import org.example.repository.impl.OrderRepositoryImpl;
import org.example.service.impl.MenuServiceImpl;
import org.example.service.impl.OrderServiceImpl;

public class RestaurantFactory {
    public static RestaurantSystemImpl createRestaurant() {
        return new RestaurantSystemImpl(
                new MenuServiceImpl(new MenuRepositoryImpl()),
                new OrderServiceImpl(new OrderRepositoryImpl()));
    }
}
