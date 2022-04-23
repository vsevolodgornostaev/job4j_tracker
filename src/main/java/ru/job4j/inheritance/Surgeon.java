package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    public boolean fracture;

    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Stretching heal(Medicines medicine) {
        return heal(medicine);
    }

}
