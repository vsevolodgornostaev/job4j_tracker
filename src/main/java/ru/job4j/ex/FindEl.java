package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
            throw new ElementNotFoundException("element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[] {"text"}, "");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
