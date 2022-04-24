package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int dentalFil;

    public Dentist(String name, String surname, String education, String birthday, int pacientCount, int dentalFil) {
        super(name, surname, education, birthday, pacientCount);
        this.dentalFil = dentalFil;
    }

    public Caries heal(Teeth teeth) {
        return heal(teeth);
    }
}
