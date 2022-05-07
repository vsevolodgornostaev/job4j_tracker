package ru.job4j.io;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок," : "Второй игрок,";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            boolean validate = matches >= 1 && matches <= 3 && count >= matches;
            if (validate) {
                System.out.println("Осталось спичек на столе: " + (count - matches) + " шт");
                count -= matches;
                turn = !turn;
            } else {
                System.out.println("Введено неверное число");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}


