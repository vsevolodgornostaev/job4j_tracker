package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String note;

    public Engineer(String name, String surname, String education, String birthday, String note) {
        super(name, surname, education, birthday);
        this.note = note;
    }

    public Calculation toCalculate(Project project) {
        return toCalculate(project);
    }
}
