package ru.job4j.inheritance;

public class Builder extends Engineer {

    private int width;

    public Builder(String name, String surname, String education, String birthday, String note, int width) {
        super(name, surname, education, birthday, note);
        this.width = width;
    }

    public Construction plan(House house) {
        return plan(house);
    }
}
