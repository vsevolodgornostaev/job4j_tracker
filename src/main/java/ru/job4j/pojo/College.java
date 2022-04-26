package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Горностаев");
        student.setName("Всеволод");
        student.setMiddleName("Андреевич");
        student.setGroup("102");
        student.setDateOfAdmission("20.02.2022");
        String ln = System.lineSeparator();
        System.out.println(
                student.getSurname() + " " + student.getName() + " " + student.getMiddleName() + ln
                + "номер группы: " + student.getGroup() + ln
                + "дата поступления: " + student.getDateOfAdmission()
        );
    }
}
