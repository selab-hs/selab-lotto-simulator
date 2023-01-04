package service;

import java.util.HashSet;
import java.util.Set;

public class RandomNumberGenerator {
    public Set<Integer> getRandomNumber() {
        Set<Integer> randomNumber = new HashSet<>();
        while (randomNumber.size() < 6) {
            randomNumber.add((int) (Math.random() * 45) + 1);
        }
        return randomNumber;
    }
}