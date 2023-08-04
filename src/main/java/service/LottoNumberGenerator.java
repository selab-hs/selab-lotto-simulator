package service;

import model.Lotto;
import model.Number;

import java.util.*;

public class LottoNumberGenerator {

    public Lotto makeNonDuplicateNumbersWhenStart(){
        Set<Integer> nonDuplicateNumber = createNonDuplicateNumbers();
        return new Lotto(makeLotto(nonDuplicateNumber.iterator()));
    }

    private List<Number> makeLotto(Iterator<Integer> iterator){
        List<Number> numbers = new LinkedList<>();
        numbers.add(new Number(true, iterator.next()));
        while (iterator.hasNext()) {
            numbers.add(new Number(false, iterator.next()));
        }
        return numbers;
    }

    private Set<Integer> createNonDuplicateNumbers() {
        Set<Integer> nonDuplicateNumbers = new HashSet<>();
        while (nonDuplicateNumbers.size() <= 6) {
            nonDuplicateNumbers.add((int) (Math.random() * 45) + 1);
        }
        return nonDuplicateNumbers;
    }
}