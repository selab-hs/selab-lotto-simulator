import java.util.Arrays;
import java.util.List;

public class CompareNumber {
    private static final String[] RANKS = {"낙첨", "낙첨", "5등", "4등", "3등", "1등"};

    public static String compareNumber(String randomNumber, List<String> autoNumberResult) {
        StringBuilder sb = new StringBuilder();
        for (String number : autoNumberResult) {
            sb.append(number).append(" ");
        }
        String autoNumbersString = sb.toString().trim();
        String[] autoNumbers = autoNumbersString.split(" ");
        int bonusNumber = Integer.parseInt(autoNumbers[1].trim());
        String[] numbers = randomNumber.split(" ");
        int matchCount = 0;
        boolean hasBonus = false;

        for (String number : numbers) {
            System.out.println("number : " + number + "numbers : " + Arrays.toString(numbers));
            int currentNumber = Integer.parseInt(number.trim());
            hasBonus = checkBonus(bonusNumber, currentNumber);
            matchCount = checkMatch(autoNumbers[0].split(" "), currentNumber, matchCount);
        }

        String rank = RANKS[matchCount];
        if (matchCount == 4 && hasBonus) {
            rank = "2등";
        }

        System.out.println("맞은 갯수: " + matchCount + ", 등수: " + rank);
        return rank;
    }

   /* private static int checkMatch(String[] autoNumbers, int currentNumber, int matchCount) {
        for (String autoNumber : autoNumbers) {
            int winningNumber = Integer.parseInt(autoNumber.trim());
            System.out.println("당첨 : " + winningNumber + "내 숫자 : " + currentNumber);
            if (currentNumber == winningNumber) {
                return matchCount + 1;
            }
        }
        return matchCount;
    }
*/
    private static int checkMatch(String[] autoNumbers, int currentNumber, int matchCount) {
        for (String autoNumber : autoNumbers) {
            String[] numberArray = autoNumber.split(" ");
            for (String number : numberArray) {
                int winningNumber = Integer.parseInt(number.trim());
                if (currentNumber == winningNumber) {
                    matchCount++;
                    break;
                }
            }
        }
        return matchCount;
    }

    private static boolean checkBonus(int bonusNumber, int currentNumber) {
        return currentNumber == bonusNumber;
    }
}
