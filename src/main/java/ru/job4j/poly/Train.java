package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " передвигается по рельсам ");
    }

    @Override
    public void tools() {
        System.out.println("на металлических колесах");
    }
}
