package ru.job4j.inheritance;

public class Builder extends Engineer {

    private int width;

    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Construction plan(House house) {
        return plan(house);
    }
}
