package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("ехать");
    }

    @Override
    public void passengers(int count) {
        System.out.println(count);
    }

    @Override
    public double priceRefuel(double refuel) {
        return 0;
    }
}
