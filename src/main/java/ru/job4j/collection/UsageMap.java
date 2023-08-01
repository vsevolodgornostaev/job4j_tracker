package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("zeuge@gmail.com", "Vsevolod Gornostaev");
        map.put("zeuge2018@gmail.com", "Vsevolod Gornostaev");
        map.put("java@it.com", "Innokentiy Illarionov");
        map.put("whereismytessarakt@avengers.com", "Loki The Hela's sun");
        map.put("whereismytessarakt@avengers.com", "Loki The agent of Asgard");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
