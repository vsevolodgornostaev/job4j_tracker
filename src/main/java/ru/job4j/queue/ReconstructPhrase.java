package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;
    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        String rsl = null;
        StringBuilder txt = new StringBuilder();
        int size = evenElements.size();
        for (int i = 0; i < size; i++) {
            if (evenElements.size() % 2 == 0) {
               txt.insert(i / 2, evenElements.getFirst());
               rsl = txt.toString();
            }
            evenElements.poll();
        }
        return rsl;
    }

    private String getDescendingElements() {
        String rsl = null;
        StringBuilder txt = new StringBuilder();
        int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            txt.insert(i, descendingElements.getLast());
            rsl = txt.toString();
            descendingElements.pollLast();
        }
        return rsl;
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }

}
