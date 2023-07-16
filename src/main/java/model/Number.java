package model;

public class Number {
    private final boolean isBonusNumber;
    private final int number;

    public Number(boolean isBonusNumber, int number) {
        this.isBonusNumber = isBonusNumber;
        this.number = number;
    }

    public boolean isBonusNumber() {
        return isBonusNumber;
    }

    public int getNumber() {
        return number;
    }
}
