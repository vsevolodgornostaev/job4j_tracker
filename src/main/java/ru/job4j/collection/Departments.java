package ru.job4j.collection;

import java.util.*;
import java.util.Comparator;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        List<String> rsl = new ArrayList<>();
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (el.toLowerCase().equals("k1") || el.toLowerCase().equals("k2")) {
                    start = el;
                    rsl.add(start);
                    tmp.add(start);
                } else {
                    tmp.add(start + "/" + el);
                    rsl.add(start + "/" + el);
                    start = rsl.get(rsl.size() - 1);
                }
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}

