package model;

import java.util.Arrays;

public enum WinningResult {
    FIRST_GRADE("1등", 6),
    SECOND_GRADE("2등", 5),
    THIRD_GRADE("3등", 5),
    FOURTH_GRADE("4등", 4),
    FIFTH_GRADE("5등", 3);

    private final int resultNumber;
    private final String result;

    WinningResult(String result, int resultNumber) {
        this.result = result;
        this.resultNumber = resultNumber;
    }

    public static String getResult(int number, boolean bonusCheck) {
        if (number == 5 && !bonusCheck) {
            return THIRD_GRADE.result;
        }

        return Arrays.stream(WinningResult.values())
                .filter(value -> value.resultNumber == number)
                .findFirst()
                .map(value -> value.result)
                .orElse("낙첨");
    }
}

