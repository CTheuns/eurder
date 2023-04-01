package com.ct.eurder.items;

import java.math.BigDecimal;
import java.util.Objects;

public class Items {

    private final String itemName;
    private final String description;
    private final BigDecimal price;
    private int stockAmount;

    public Items(String itemName, String description, BigDecimal price, int stockAmount) {
        this.itemName = itemName;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public String getItemName() {
        return itemName;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return Objects.equals(getItemName(), items.getItemName()) && Objects.equals(getDescription(), items.getDescription()) && Objects.equals(getPrice(), items.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItemName(), getDescription(), getPrice());
    }
}
