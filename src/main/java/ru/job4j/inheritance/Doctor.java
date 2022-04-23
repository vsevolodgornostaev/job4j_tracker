package ru.job4j.inheritance;

public class Doctor extends Profession {

    private int pacientCount;

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    Diagnosis heal(Pacient pacient) {
        return heal(pacient);
    }
}


