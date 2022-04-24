package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    public boolean fracture;

    public Surgeon(String name, String surname, String education, String birthday, int pacientCount, boolean fracture) {
        super(name, surname, education, birthday, pacientCount);
        this.fracture = fracture;
    }

    public Stretching heal(Medicines medicine) {
        return heal(medicine);
    }

}
