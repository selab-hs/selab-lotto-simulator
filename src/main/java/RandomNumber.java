import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomNumber {
    private static final int RANDOM_VALUE_SIZE = 6;
    private static final Random random = new Random();

    public RandomNumber(int inputValue) {
        AutoNumber autoNumber = new AutoNumber();
        List<String> randomNumbers = createRandomNumbers(inputValue);

        printRandomNumbers(randomNumbers, autoNumber);
    }

    private void printRandomNumbers(List<String> randomNumbers, AutoNumber autoNumber) {
        CompareNumber compareNumber = new CompareNumber();

        Output.randomNumberScreen();
        for (String number : randomNumbers) {
            // 이 부분에 비교하여 등수 책정
            String rank = CompareNumber.compareNumber(number, autoNumber.autoNumberResult);
            Output.printRandomNumbers(number, rank);
        }
    }

    private static List<String> createRandomNumbers(int inputValue) {
        List<String> randomNumbers = new ArrayList<>();
        getRandomNumbers(randomNumbers,inputValue);
        return randomNumbers;
    }

    private static void getRandomNumbers(List<String> randomNumbers, int inputValue) {
        for (int j = 0; j < inputValue; j++) {
            int[] generatedNumbers = generateRandomNumbers();
            Arrays.sort(generatedNumbers);
            StringBuilder randomValue = new StringBuilder();
            appendValue(randomValue,generatedNumbers);
            randomNumbers.add(randomValue.toString().trim());
        }
    }

    private static void appendValue(StringBuilder randomValue, int[] generatedNumbers) {
        for (int number : generatedNumbers) {
            randomValue.append(number).append(" ");
        }
    }

    private static int[] generateRandomNumbers() {
        int[] randomNumbers = new int[RANDOM_VALUE_SIZE];
        for (int i = 0; i < RANDOM_VALUE_SIZE; i++) {
            randomNumbers[i] = generateRandomNumber(randomNumbers, i);
        }
        return randomNumbers;
    }

    private static int generateRandomNumber(int[] randomNumbers, int currentIndex) {
        int digit;
        while (true) {
            digit = random.nextInt(45) + 1;
            if (!hasDuplicateDigit(randomNumbers, digit, currentIndex)) {
                break;
            }
        }
        return digit;
    }

    private static boolean hasDuplicateDigit(int[] usedDigits, int digit, int currentIndex) {
        for (int i = 0; i < currentIndex; i++) {
            if (usedDigits[i] == digit) {
                return true;
            }
        }
        return false;
    }
}