package model;

import java.util.*;

public class Lotto {
    private List<Number> numbers = new LinkedList<>();

    public Lotto() {
        Set<Integer> nonDuplicateNumber = createNonDuplicateNumbers();
        Iterator<Integer> iterator = nonDuplicateNumber.iterator();
        numbers.add(new Number(true, iterator.next()));
        while (iterator.hasNext()) {
            numbers.add(new Number(false, iterator.next()));
        }
    }

    private Set<Integer> createNonDuplicateNumbers() {
        Set<Integer> nonDuplicateNumbers = new HashSet<>();
        while (nonDuplicateNumbers.size() <= 6) {
            nonDuplicateNumbers.add((int) (Math.random() * 45) + 1);
        }
        return nonDuplicateNumbers;
    }

    public List<Number> getNumbers() {
        return numbers;
    }
}