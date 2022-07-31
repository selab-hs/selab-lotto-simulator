package model;

import java.util.Set;
import java.util.TreeSet;

public class WinningNumber {
    private final Set<Integer> winningNumbers;
    private final int winningBonusNumber;

    public WinningNumber() {
        this.winningNumbers = generateWinningNumbers();
        this.winningBonusNumber = generateWinningBonusNumber();
    }

    private Set<Integer> generateWinningNumbers() {
        Set<Integer> winningNumbers = new TreeSet<>();
        while (winningNumbers.size() < 6) {
            winningNumbers.add((int) (Math.random() * 45 + 1));
        }
        return winningNumbers;
    }

    private int generateWinningBonusNumber() {
        int bonusNumber = (int) (Math.random() * 45 + 1);
        if (winningNumbers.contains(bonusNumber)) {
            return generateWinningBonusNumber();
        }
        return bonusNumber;
    }

    public Set<Integer> getNumbers() {
        return winningNumbers;
    }

    public int getBonusNumber() {
        return winningBonusNumber;
    }
}
