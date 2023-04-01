package com.ct.eurder.items;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsService {

    private final ItemsRepositery itemsRepositery;

    public ItemsService(ItemsRepositery itemsRepositery) {
        this.itemsRepositery = itemsRepositery;
    }

    public void add(Items itemInput) {
        itemsRepositery.addItem(itemInput);
    }

    public List<Items> getAllItems() {
        itemsRepositery.getAllItems();
        return itemsRepositery.getAllItems();
    }
}
