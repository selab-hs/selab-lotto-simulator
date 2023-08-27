import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AutoNumber {
    private static final int RANDOM_VALUE_SIZE = 6;
    private final List<Integer> autoNumber = createRandomNumbers();
    private final List<String> autoNumberResult = createAutoNumberResult(autoNumber);

    public AutoNumber() {
        Output.autoNumberScreen(autoNumberResult);
    }

    protected List<String> getAutoNumberResult() {
        return autoNumberResult;
    }

    public static List<String> createAutoNumberResult(List<Integer> randomValue) {
        List<String> result = new ArrayList<>();
        for (Integer number : randomValue) {
            result.add(number.toString());
        }
        result.add("+");
        result.add(createBonusNumber(randomValue));
        return result;
    }

    private static String createBonusNumber(List<Integer> randomValue) {
        Random random = new Random();

        while (true) {
            String digit = Integer.toString(random.nextInt(45) + 1);
            if (!hasDuplicateDigit(randomValue, Integer.parseInt(digit)))
                return digit;
        }
    }

    static List<Integer> createRandomNumbers() {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < RANDOM_VALUE_SIZE; i++) {
            randomNumbers.add(generateRandomNumber(randomNumbers));
        }
        randomNumbers.sort(Integer::compareTo);
        return randomNumbers;
    }

    private static int generateRandomNumber(List<Integer> randomNumbers) {
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

    public static boolean hasDuplicateDigit(List<Integer> usedDigits, int digit) {
        return usedDigits.contains(digit);
    }
}
