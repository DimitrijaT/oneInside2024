package org.example.model;

import org.example.model.enumeration.FoodCategory;
import org.example.util.TaxPercentage;

public class Food extends MenuItem {

    private FoodCategory foodCategory;

    public Food(String name, String shortDescription, Double price, FoodCategory foodCategory) {
        super(name, shortDescription, price);
        this.foodCategory = foodCategory;
    }

    @Override
    public Double getTaxPercentage() {
        return TaxPercentage.FOOD_TAX_PERCENTAGE;
    }

    public FoodCategory getFoodCategory() {
        return foodCategory;
    }
}
