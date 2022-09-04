package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        boolean checkDigit = false;
        boolean checkSymbol = false;
        String[] register = {"qwerty", "12345", "password", "admin", "user"};

        if (password == null) {
            throw new IllegalArgumentException();
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Длина пароля находится в диапазоне [8, 32]");
        }
        if (password.equals(password.toLowerCase())) {
            throw new IllegalArgumentException("Пароль содержит хотя бы один символ в верхнем регистре");
        }
        if (password.equals(password.toUpperCase())) {
            throw new IllegalArgumentException("Пароль содержит хотя бы один символ в нижнем регистре");
        }
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 58) {
                checkDigit = true;
                break;
            }
        }
        if (!checkDigit) {
            throw new IllegalArgumentException("Пароль содержит хотя бы одну цифру");
        }
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 32 && password.charAt(i) <= 47
                    || password.charAt(i) >= 58 && password.charAt(i) <= 64
                    || password.charAt(i) >= 91 && password.charAt(i) <= 96
                    || password.charAt(i) >= 123 && password.charAt(i) <= 127) {
                checkSymbol = true;
                break;
            }
        }
        if (!checkSymbol) {
            throw new IllegalArgumentException("Пароль содержит хотя бы один спец. символ (не цифра и не буква)");
        }
        for (String reg : register) {
            if (password.toLowerCase().contains(reg.toLowerCase())) {
                throw new IllegalArgumentException("Пароль не содержит подстрок без учета регистра: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}
