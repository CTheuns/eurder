package com.ct.eurder.items;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Itemgroup {

    private int orderAmount;
    private LocalDate date;
    private UUID itemToOrderId;

    public Itemgroup(int orderAmount, Items itemToOrder) {
        this.orderAmount = orderAmount;
        this.itemToOrderId = itemToOrder.getItemId();
        this.date = LocalDate.now();
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public UUID getItemToOrderId() {
        return itemToOrderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Itemgroup itemgroup = (Itemgroup) o;
        return Objects.equals(getItemToOrderId(), itemgroup.getItemToOrderId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItemToOrderId());
    }
}
