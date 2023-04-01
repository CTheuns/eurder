package com.ct.eurder;

import com.ct.eurder.items.Itemgroup;
import com.ct.eurder.items.ItemsRepositery;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Orders {

    private  Map<UUID, Itemgroup> order;

    public Orders(Map<UUID, Itemgroup> order) {
        this.order = new HashMap<>();
    }


}
