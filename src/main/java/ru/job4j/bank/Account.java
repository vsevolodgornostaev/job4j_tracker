package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счета
 * @author VSEVOLOD GORNOSTAEV
 * @version 1.0
 */
public class Account {
    /**
     * Банковский счет состоит из двух параметров - банковские реквизиты и
     * баланс денежных средств. Эти параметры хранятся в примитивных переменных
     * типа String и double соответсвенно
     */
    private String requisite;
    private double balance;

    /**
     * При создании банковского счета требуется указать два его параметра.
     * Для этого создаем конструктор с входными параметрами:
     * @param requisite - банковские реквизиты
     * @param balance - баланс денежных средств
     */
    public Account(String requisite, double balance) {
     this.requisite = requisite;
     this.balance = balance;
    }

    /**
     * Метод для получения значения банковских реквизитов
     * @return возвращает значение банковских реквизитов
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод для записи банковских реквизитов
     * @param requisite банковские реквизиты, которые указывает пользователь
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод для получения баланса денежных средств на счете
     * @return возвращает значение денежных средств на счете
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод для записи баланса денежных средств
     * @param balance баланс денежных средств, который указывается либо пользователем, либо
     * может быть установлен рассчетным путём
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Переопределение метода equals. Банковские счета должны сравниваться только по
     * номеру банковских реквизитов
     * @param o банковский счет, который сровнивается с другим банковским счетом
     * @return возвращает true, если банковские реквизиты идентичны, false - если нет
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Переопределеине метода hashcode. Поскольку метод equals был переопределен, то по такому
     * же принципу нужно переопределить метод hashcode. То есть, если сравниваемые банковские реквизиты
     * идентичны, то они должны иметь одинаковый уникальный целочисленный код в ячейке памяти.
     * @return возвращет целое число типа int записанных в ячейку памяти банковских реквизитов
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
