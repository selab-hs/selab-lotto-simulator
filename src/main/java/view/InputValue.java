package view;

import java.util.Scanner;

public class InputValue {
    private final static Scanner scanner = new Scanner(System.in);

    public int inputStartNumber() {
        int number = inputNumber();
        if (validateStartNumber(number)) {
            return number;
        }
        new OutputScreen().inputError();
        return inputStartNumber();
    }

    public int inputSimulationLoopNumber() {
        int number = inputNumber();
        if (validateSimulationRunNumber(number)) {
            return number;
        }
        new OutputScreen().inputError();
        return inputSimulationLoopNumber();
    }

    public int inputNumber() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            new OutputScreen().inputError();
            return inputNumber();
        }
    }

    private boolean validateStartNumber(int number) {
        return number == 1 || number == 2;
    }

    private boolean validateSimulationRunNumber(int number) {
        return number >= 0 && number <= 100;
    }
}
