import java.util.ArrayList;
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
        Output.randomNumberScreen();
        for (String number : randomNumbers) {
            String rank = CompareNumber.compareNumber(number, autoNumber.getAutoNumberResult());
            Output.printRandomNumbers(number, rank);
        }
    }

    public static List<String> createRandomNumbers(int inputValue) {
        List<String> randomNumbers = new ArrayList<>();
        for (int j = 0; j < inputValue; j++) {
            List<Integer> generatedNumbers = generateRandomNumbers();
            generatedNumbers.sort(Integer::compare);
            randomNumbers.add(listToString(generatedNumbers));
        }
        return randomNumbers;
    }

    private static String listToString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (Integer number : list) {
            sb.append(number).append(" ");
        }
        return sb.toString().trim();
    }

    private static List<Integer> generateRandomNumbers() {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < RANDOM_VALUE_SIZE; i++) {
            randomNumbers.add(generateRandomNumber(randomNumbers, i));
        }
        return randomNumbers;
    }

    private static int generateRandomNumber(List<Integer> randomNumbers, int currentIndex) {
        int digit;
        while (true) {
            digit = random.nextInt(45) + 1;
            if (!hasDuplicateDigit(randomNumbers, digit, currentIndex)) {
                break;
            }
        }
        return digit;
    }

    private static boolean hasDuplicateDigit(List<Integer> usedDigits, int digit, int currentIndex) {
        for (int i = 0; i < currentIndex; i++) {
            if (usedDigits.get(i) == digit) {
                return true;
            }
        }
        return false;
    }
}
