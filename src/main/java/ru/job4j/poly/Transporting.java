package ru.job4j.poly;

public class Transporting {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle motorbus = new Motorbus();
        Vehicle[] vehicles = new Vehicle[] {plane, train, motorbus};
        for (Vehicle tr : vehicles) {
            tr.move();
            tr.tools();
        }
    }
}
