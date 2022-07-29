package run;

public enum DrawResult {
    FIRSTCLASS(1),
    SECONDCLASS(2),
    THIRDCLASS(3),
    FOURTHCLASS(4),
    FIVETHCLASS(5);

    private final int winningResult;

    DrawResult(int number) {
        this.winningResult = number;
    }
}

