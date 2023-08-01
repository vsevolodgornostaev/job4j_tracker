package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (int i = 0; i < orders.size(); i++) {
            map.put(orders.get(i).getNumber(), orders.get(i));
        }
        return map;
    }
}
