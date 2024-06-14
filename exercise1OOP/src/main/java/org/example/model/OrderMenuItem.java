package org.example.model;

public class OrderMenuItem {

    private MenuItem item;

    private Integer quantity;

    public OrderMenuItem(MenuItem item, Integer quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public MenuItem getItem() {
        return item;
    }

    public void setItem(MenuItem item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    //TODO if not lazy add tabs:
    public String printMenuItem(int tabs) {

        return String.format("%s%s %.2f$ x%d\n", "\t".repeat(tabs), item.getName(), item.getPrice(), quantity);
    }

}
