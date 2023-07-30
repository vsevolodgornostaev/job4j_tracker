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
        StringBuilder txt = new StringBuilder();
        int size = evenElements.size();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
               txt.append(evenElements.getFirst());
            }
            evenElements.poll();
        }
        return txt.toString();
    }

    private String getDescendingElements() {
        StringBuilder txt = new StringBuilder();
        int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            txt.append(descendingElements.pollLast());
        }
        return txt.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }

}
