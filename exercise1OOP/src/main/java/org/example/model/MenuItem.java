package org.example.model;

public abstract class MenuItem {
    private String name;
    private String shortDescription;
    private Double Price;
    private Double taxPercentage;

    public abstract Double getTaxPercentage();

    public MenuItem(String name, String shortDescription, Double price) {
        this.name = name;
        this.shortDescription = shortDescription;
        Price = price;
    }

    public String getName() {
        return name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public Double getPrice() {
        return Price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", Price=" + Price +
                ", taxPercentage=" + taxPercentage +
                '}';
    }
}
