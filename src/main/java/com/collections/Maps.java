package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {

    public Map<String, Integer> createInventory(List<String> items) {
        Map<String, Integer> inventario = new HashMap<>();

        for (int i = 0; i < items.size(); i++) {

        String item = items.get(i);
            if (!inventario.containsKey(item)) {
                inventario.put(item, 1);
            } else {
                inventario.put(item, inventario.get(item) + 1);
        }

    }
        return inventario;
    }

    public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        for (int i = 0; i < items.size(); i++) {
            String item = items.get(i);

            if (inventory.containsKey(item)) {

                inventory.put(item, inventory.get(item) + 1);
            } else {

                inventory.put(item, 1);
            }
        }
        return inventory;

    }

    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
       for (int i = 0; i < items.size(); i++) {
           String item = items.get(i);
           if (inventory.containsKey(item)) {
               if (inventory.get(item) > 0) {
                   inventory.put(item, inventory.get(item) - 1);
               }
               else {
                   inventory.put(item, 0);
               }
           }
       }
        return inventory;
    }

    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        inventory.remove(item);
        return inventory;
    }
    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        List<Map.Entry<String, Integer>> availableItems = new ArrayList<>();
        List<String> keys = new ArrayList<>(inventory.keySet()); //

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            Integer value = inventory.get(key);
            if (value > 0) {
                availableItems.add(Map.entry(key, value));
            }
        }

        return availableItems;
    }
    }
