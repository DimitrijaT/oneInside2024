package org.example.model;

import org.example.util.TaxPercentage;

public class Beverage extends MenuItem {

    public Beverage(String name, String shortDescription, Double price) {
        super(name, shortDescription, price);
    }

    @Override
    public Double getTaxPercentage() {
        return TaxPercentage.BEVERAGE_TAX_PERCENTAGE;
    }
}
