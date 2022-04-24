package ru.job4j.inheritance;

public class Doctor extends Profession {

    private int pacientCount;

    public Doctor(String name, String surname, String education, String birthday, int pacientCount) {
        super(name, surname, education, birthday);
        this.pacientCount = pacientCount;
    }

    Diagnosis heal(Pacient pacient) {
        return heal(pacient);
    }
}


