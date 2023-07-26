package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class UniqueTextTest {
    @Test
    public void isEquals() {
        UniqueText uniqueText = new UniqueText();
        String origin = "My cat eats mouse";
        String text = "My cat eats mouse";
        assertThat(uniqueText.isEquals(origin, text)).isTrue();
    }

    @Test
    public void isNotEquals() {
        UniqueText uniqueText = new UniqueText();
        String origin = "My cat eats a mouse";
        String text = "A mouse is eaten by a cat";
        assertThat(uniqueText.isEquals(origin, text)).isFalse();
    }
}