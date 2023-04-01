package com.ct.eurder.items;

import com.ct.eurder.Orders;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;

@Repository
public class ItemsRepositery {

    Map<UUID, Items> itemsDatabese;

    public ItemsRepositery() {
        this.itemsDatabese = new HashMap<>();
    }

    public void addItem(Items itemInput) {
        UUID key = UUID.randomUUID();
        itemsDatabese.put(key, itemInput);
    }

    public List<Items> getAllItems() {
        return List.copyOf(itemsDatabese.values());
    }

    public boolean isItemInStock(Items items){
       return itemsDatabese.containsKey(items.getItemId());
    }

    public boolean isEnoughInStock(Items items,Itemgroup itemgroup){
        return (items.getStockAmount() >= itemgroup.getOrderAmount());
    }


    public void addItemGroup(Itemgroup itemgroup, Orders order){
        UUID orderId = UUID.randomUUID();
       Items soldItem = itemsDatabese.get(itemgroup.getItemToOrderId());
        int supplyAmount = soldItem.getStockAmount();
        int neededAmount = itemgroup.getOrderAmount();
        if (isItemInStock(soldItem) && supplyAmount >= neededAmount){
            order.put(orderId,itemgroup);

        }
    }


}
