package com.ct.eurder.items;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ItemsRepositery {

    Map<Integer, Items> itemsDatabese;
    int key = 0;

    public ItemsRepositery() {
        this.itemsDatabese = new HashMap<>();
    }

    public void addItem(Items itemInput) {
        key++;
        itemsDatabese.put(key, itemInput);
    }

    public List<Items> getAllItems() {
        return List.copyOf(itemsDatabese.values());
    }
}
