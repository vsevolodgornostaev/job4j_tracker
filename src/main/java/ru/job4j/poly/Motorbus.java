package ru.job4j.poly;

public class Motorbus implements Vehicle {
    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " двигается по скоростным трассам ");
    }

    @Override
    public void tools() {
        System.out.println("на колёсах");
    }
}
