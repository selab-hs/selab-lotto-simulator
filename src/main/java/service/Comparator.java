package service;

import model.Number;

import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Comparator {
    public int compare(Set<Integer> randomNumber, List<Number> lottoNumber) {
        int matchCount = 0;
        boolean isBonusNumberCounted = false;
        int i = 0;

        Iterator<Integer> iterator = randomNumber.iterator();
        while (iterator.hasNext()) {
            Number number = lottoNumber.get(i);
            boolean correct = isSameNumber(iterator.next(), number.getNumber());
            boolean isBonusNumber = number.isBonusNumber();

            if (correct && isBonusNumber) {
                matchCount++;
                isBonusNumberCounted = true;
            } else if (correct) {
                matchCount++;
            }
            i++;
        }
        System.out.println(matchCount);
        return rankCalculation(isBonusNumberCounted, matchCount);
    }

    private boolean isSameNumber(int randomNumber, int lottoNumber) {
        return randomNumber == lottoNumber;
    }

    private int rankCalculation(boolean bonusNumber, int matchCount){
        if(bonusNumber){
            return matchBonusNumber(matchCount);
        }
        return nonMatchBonusNumber(matchCount);
    }

    private int matchBonusNumber(int matchCount){
        switch (matchCount) {
            case 6 -> {
                return 2;
            }
            case 5 -> {
                return 3;
            }
            case 4 -> {
                return 4;
            }
            case 3 -> {
                return 5;
            }
            default -> {
                return 0;
            }
        }
    }

    private int nonMatchBonusNumber(int matchCount){
        switch (matchCount) {
            case 6 -> {
                return 1;
            }
            case 5 -> {
                return 3;
            }
            case 4 -> {
                return 4;
            }
            case 3 -> {
                return 5;
            }
            default -> {
                return 0;
            }
        }
    }
}
