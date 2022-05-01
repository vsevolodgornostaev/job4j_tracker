package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book java = new Book("Java", 520);
        Book cleanCode = new Book("Clean code", 500);
        Book sapiens = new Book("Sapiens", 700);
        Book dune = new Book("Dune", 1500);
        Book[] books = new Book[4];
        books[0] = java;
        books[1] = cleanCode;
        books[2] = sapiens;
        books[3] = dune;
        for (int index = 0; index < books.length; index++) {
            Book bks = books[index];
            System.out.println(bks.getBookName() + " - " + bks.getPageCount());
        }
        System.out.println();
        System.out.println("After changing books[0] with books[3]");
        books[0] = dune;
        books[3] = java;
        for (int index = 0; index < books.length; index++) {
            Book bks = books[index];
            System.out.println(bks.getBookName() + " - " + bks.getPageCount());
        }
        System.out.println();
        System.out.println("All the books named \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            Book bks = books[index];
            if ("Clean code".equals(bks.getBookName())) {
                System.out.println(bks.getBookName() + " - " + bks.getPageCount());
            }
        }
    }
}
