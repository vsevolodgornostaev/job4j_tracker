package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int dentalFil;

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Caries heal(Teeth teeth) {
        return heal(teeth);
    }
}
