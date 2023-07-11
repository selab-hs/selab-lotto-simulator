import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    private static final int RANDOM_VALUE_SIZE = 6;
    private static final Random random = new Random();

    public RandomNumber(int inputValue) {
        AutoNumber autoNumber = new AutoNumber();
        System.out.println("********* 자동 생성 번호 *********");
        String[] randomNumbers = createRandomNumbers(inputValue);
        printRandomNumbers(randomNumbers, autoNumber);
    }

    private void printRandomNumbers(String[] randomNumbers, AutoNumber autoNumber) {
        CompareNumber compareNumber = new CompareNumber();
        for (String number : randomNumbers) {
            //이 부분에 비교 하여 등수 책정
            CompareNumber.compareNumber(randomNumbers, autoNumber.autoNumberResult);
            System.out.println(number);
        }
    }



    private static String[] createRandomNumbers(int inputValue) {
        String[] randomNumbers = new String[inputValue];
        for (int j = 0; j < inputValue; j++) {
            int[] generatedNumbers = generateRandomNumbers();
            Arrays.sort(generatedNumbers);

            StringBuilder randomValue = new StringBuilder();
            for (int number : generatedNumbers) {
                randomValue.append(number).append(" ");
            }
            randomNumbers[j] = randomValue.toString().trim();
        }
        return randomNumbers;
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
