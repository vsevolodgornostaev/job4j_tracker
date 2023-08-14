package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int result = 0;
        int compareByLength = Integer.compare(left.length(), right.length());

        if (compareByLength == 0) {
            for (int i = 0; i < left.length(); i++) {
                result = Character.compare(left.charAt(i), right.charAt(i));
                if (result != 0) {
                    break;
                }
            }
        } else if (compareByLength < 0) {
            for (int i = 0; i < left.length(); i++) {
                result = Character.compare(left.charAt(i), right.charAt(i));
                if (result != 0) {
                    break;
                }
                result = compareByLength;
            }
        } else {
            for (int i = 0; i < right.length(); i++) {
                result = Character.compare(left.charAt(i), right.charAt(i));
                if (result != 0) {
                    break;
                }
                result = compareByLength;
            }
        }
        return result;
    }
}

