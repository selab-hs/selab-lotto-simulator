package view;

import java.util.Scanner;

public class InputValue {
    private final static Scanner scanner = new Scanner(System.in);
    private final static int MAX_SIMULATION = 1000;
    private final OutputView outputScreen;

    public InputValue(OutputView outputScreen) {
        this.outputScreen = outputScreen;
    }

    public int inputStartNumber() {
        int number = inputNumber();
        if (validateStartNumber(number)) {
            return number;
        }
        outputScreen.inputError();
        return inputStartNumber();
    }

    public int inputSimulationLoopNumber() {
        int number = inputNumber();
        if (validateSimulationRunNumber(number)) {
            return number;
        }
        outputScreen.inputError();
        return inputSimulationLoopNumber();
    }

    public int inputNumber() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            outputScreen.inputError();
            return inputNumber();
        }
    }

    private boolean validateStartNumber(int number) {
        return number == 1 || number == 2;
    }

    private boolean validateSimulationRunNumber(int number) {
        return number >= 0 && number <= MAX_SIMULATION;
    }
}
