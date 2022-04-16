package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error err = new Error(true, 2, "o_O");
        Error errwtf = new Error(false, 3, "wtf");
        error.printInfo();
        System.out.println();
        err.printInfo();
        System.out.println();
        errwtf.printInfo();
    }
}

