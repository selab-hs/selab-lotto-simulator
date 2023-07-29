package service;

import model.Number;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Comparator {
    private int matchCount = 0;
    private boolean isBonusNumberCounted = false;

    public int compare(Set<Integer> randomNumber, List<Number> lottoNumber) {

        Iterator<Integer> iter = randomNumber.iterator();

        for (Number number : lottoNumber) {
            compareSinglePart(number, iter.next());
        }

        return rankCalculation(isBonusNumberCounted, matchCount);
    }

    private void compareSinglePart(Number number, Integer randomNumber) {
        boolean correct = isSameNumber(randomNumber, number.getNumber());

        if (correct && number.isBonusNumber()) {
            this.isBonusNumberCounted = true;
        }
    }

    private boolean isSameNumber(int randomNumber, int lottoNumber) {
        if(randomNumber == lottoNumber){
            this.matchCount++;
            return true;
        }
        return false;
    }

    private int rankCalculation(boolean bonusNumber, int matchCount) {
        if (bonusNumber) {
            return matchBonusNumber(matchCount);
        }
        return nonMatchBonusNumber(matchCount);
    }

    private int matchBonusNumber(int matchCount) {
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

    private int nonMatchBonusNumber(int matchCount) {
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
