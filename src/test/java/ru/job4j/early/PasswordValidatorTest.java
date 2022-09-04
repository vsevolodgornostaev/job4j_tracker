package ru.job4j.early;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;
import static ru.job4j.early.PasswordValidator.validate;
import static org.junit.matchers.JUnitMatchers.*;

import org.hamcrest.Matchers;
import org.junit.Test;

public class PasswordValidatorTest {

    @Test
    public void whenPasswordIsNull() {
      String password = null;
      try {
          validate(password);
      } catch (IllegalArgumentException ex) {
          assertThat(ex.getMessage(), is(nullValue()));
      }
    }

    @Test
    public void whenPasswordIsWrongLength() {
        String password = "aa0101";
        try {
            validate(password);
        } catch (IllegalArgumentException ex) {
            assertThat(ex.getMessage(), containsString("Длина пароля находится в диапазоне [8, 32]"));
        }
    }

    @Test
    public void whenPasswordWithNoUpRgister() {
        String password = "aaaaaa0101";
        try {
            validate(password);
        } catch (IllegalArgumentException ex) {
            assertThat(ex.getMessage(), containsString("Пароль содержит хотя бы один символ в верхнем регистре"));
        }
    }

    @Test
    public void whenPasswordWithNoLowRgister() {
        String password = "AAAAAA0101";
        try {
            validate(password);
        } catch (IllegalArgumentException ex) {
            assertThat(ex.getMessage(), containsString("Пароль содержит хотя бы один символ в нижнем регистре"));
        }
    }

    @Test
    public void whenPasswordWithNoDigit() {
        String password = "Aaaaaavdvd";
        try {
            validate(password);
        } catch (IllegalArgumentException ex) {
            assertThat(ex.getMessage(), containsString("Пароль содержит хотя бы одну цифру"));
        }
    }

    @Test
    public void whenPasswordWithNoSymbol() {
        String password = "Aaaaaavdvd0101";
        try {
            validate(password);
        } catch (IllegalArgumentException ex) {
            assertThat(ex.getMessage(), containsString("Пароль содержит хотя бы один спец. символ (не цифра и не буква)"));
        }
    }

    @Test
    public void whenPasswordWithWrongRegister() {
        String[] password = {"QweRtY0101@", "USEr1232131@", "Aasbvb12345!!@", "pasSwoRd12@x%", "adminX1122@!"};
        for (String pass : password) {
            try {
                validate(pass);
            } catch (IllegalArgumentException ex) {
                assertThat(ex.getMessage(), containsString("Пароль не содержит подстрок без учета регистра: qwerty, 12345, password, admin, user"));
            }
        }
    }
}