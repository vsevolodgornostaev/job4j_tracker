package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int minus(int y) {
        return y - x;
    }

    public static int sum(int y) {
        return x + y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int sumAllOperation(int y) {
        return minus(y) + sum(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Результат метода sum: " + sum(10));
        System.out.println("Результат метода minus: " + minus(10));
        System.out.println("Результат метода divide: " + calculator.divide(10));
        System.out.println("Результат метода multiply: " + calculator.multiply(5));
        System.out.println("Результат метода sumAllOperation: " + calculator.sumAllOperation(2));
    }
}

