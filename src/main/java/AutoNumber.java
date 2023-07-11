import java.util.Arrays;
import java.util.Random;

public class AutoNumber {
    private static final int RANDOM_VALUE_SIZE = 6;

    public AutoNumber() {
        System.out.println("*********** 당첨 번호 ***********");
        final String autoNumber = createRandomNumbers();
        final String autoNumberResult = autoNumber + " + " + createBonusNumber(autoNumber);
        printAutoNumber(autoNumberResult);
    }

    private String createBonusNumber(String randomValue) {
        Random random = new Random();

        while (true) {
            String digit = Integer.toString(random.nextInt(45) + 1);
            if (!hasDuplicateDigit(randomValue, digit))
                return digit;
        }
    }

    private void printAutoNumber(String autoNumberResult) {
        System.out.println(autoNumberResult);
    }

    private static String createRandomNumbers() {
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

    public static boolean hasDuplicateDigit(String usedDigits, String digit) {
        String[] digitsArray = usedDigits.split(" ");
        for (String usedDigit : digitsArray) {
            if (usedDigit.equals(digit)) {
                return true;
            }
        }
        return false;
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
