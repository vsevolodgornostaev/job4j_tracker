package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private int operation;

    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Check validate(Validation validation) {
        return validate(validation);
    }
}
