package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ItemTestSort {
    @Test
    public void whenItemAscByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "first"),
                new Item(2, "second"),
                new Item(3, "third"),
                new Item(4, "fourth"),
                new Item(5, "fifth"),
                new Item(6, "sixth")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(5, "fifth"),
                new Item(1, "first"),
                new Item(4, "fourth"),
                new Item(2, "second"),
                new Item(6, "sixth"),
                new Item(3, "third")
        );
        assertTrue(items.equals(expected));
    }

    @Test
    public void whenItemDescByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "first"),
                new Item(2, "second"),
                new Item(3, "third"),
                new Item(4, "fourth"),
                new Item(5, "fifth"),
                new Item(6, "sixth")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(3, "third"),
                new Item(6, "sixth"),
                new Item(2, "second"),
                new Item(4, "fourth"),
                new Item(1, "first"),
                new Item(5, "fifth")
        );
        assertTrue(items.equals(expected));
    }

}