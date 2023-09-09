package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банка
 * @author VSEVOLOD GORNOSTAEV
 * @version 1.0
 */
public class User {
    /**
     * Для идентификации пользователя банка используются его имя и номер паспорта.
     * Имя и номер паспорта хранятся в примитивных переменных типа String
     */
    private String passport;
    private String username;

    /**
     * При добавлении пользователя требуется указать два его параметра.
     * Для этого создаем конструктор с входными параметрами:
     * @param passport - номера паспорта пользователя
     * @param username - имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод для получения номера паспорта пользователя
     * @return возвращает номер паспорта пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод для записи номера паспорта пользователя
     * @param passport номер паспорта пользователя
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод для получения имени пользователя
     * @return возвращает имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод для записи имени пользователя
     * @param username имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределение метода equals. Пользователи должны сравниваться только по
     * номеру их паспорта
     * @param o номер паспорта пользователя, который сравнивается с другим
     * @return возвращает true, если номера паспорта идентичны, false - если нет
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределеине метода hashcode. Поскольку метод equals был переопределен, то по такому же
     * принципу нужно переопределить метод hashcode. То есть, если сравниваемые номера паспорта
     * идентичны, то они должны иметь одинаковый уникальный целочисленный код в ячейке памяти.
     * @return возвращет целое число типа int записанных в ячейку памяти номеров паспорта
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
