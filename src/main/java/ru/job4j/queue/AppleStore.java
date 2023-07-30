package ru.job4j.queue;

import java.util.LinkedList;
import java.util.Queue;

public class AppleStore {
    public final Queue<Customer> queue;
    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        String customer = null;
        for (int i = 0; i < count; i++) {
            customer = queue.poll().getName();
        }
        return customer;
    }

    public String getFirstUpsetCustomer() {
        String customer = null;
        for (int i = 0; i <= count; i++) {
            customer = queue.poll().getName();
        }
        return customer;
    }
}
