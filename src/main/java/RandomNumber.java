import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    private static final int RANDOM_VALUE_SIZE = 6;
    public RandomNumber(int inputValue){
        System.out.println("********* 자동 생성 번호 *********");
        for (int i = 0; i < inputValue; i++) {
            String randomNumber = createRandomNumbers();
            PrintRandomNumbers(randomNumber);
        }
    }

    private void PrintRandomNumbers(String randomNumber) {
        System.out.println(sortRandomValue(randomNumber));
    }

    private static String sortRandomValue(String randomValue) {
        String[] digitsArray = randomValue.split(" ");
        Arrays.sort(digitsArray);

        StringBuilder sortedValue = new StringBuilder();
        for (String digit : digitsArray) {
            sortedValue.append(digit).append(" ");
        }
        return sortedValue.toString().trim();
    }

    private static String createRandomNumbers() {
        // 4 10 14 15 24 34 -> 낙점
        int[] randomNumbers = new int[RANDOM_VALUE_SIZE];
        for (int i = 0; i < RANDOM_VALUE_SIZE; i++) {
            randomNumbers[i] = generateRandomNumber(randomNumbers);
        }
        Arrays.sort(randomNumbers);
        StringBuilder randomValue = new StringBuilder();
        for (int number : randomNumbers) {
            randomValue.append(number).append(" ");
        }
        return randomValue.toString().trim();
    }

    private static int generateRandomNumber(int[] randomNumbers) {
        Random random = new Random();
        int digit;
        while (true) {
            digit = random.nextInt(45) + 1;
            if (!hasDuplicateDigit(randomNumbers, digit)) {
                break;
            }
        }
        return digit;
    }

    public static boolean hasDuplicateDigit(int[] usedDigits, int digit) {
        for (int usedDigit : usedDigits) {
            if (usedDigit == digit) {
                return true;
            }
        }
        return false;
    }
}
