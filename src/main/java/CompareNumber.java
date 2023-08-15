import java.util.Arrays;
import java.util.List;

public class CompareNumber {
    private static int matchCount;
    private static boolean hasBonus;
    public static String compareNumber(String randomNumber, List<String> autoNumberResult) {
        matchCount = 0;
        hasBonus = false;
        checkRank(randomNumber.split(" "), ListToString(autoNumberResult));
        Rank.setRankResult(matchCount, hasBonus);
        Rank rank = setRank(matchCount, hasBonus);
        return rank.getDisplayName();
    }
    private static void checkRank(String[] numbers, String autoNumber) {

        int index = autoNumber.indexOf("+");
        int bonusNumber = Integer.parseInt(autoNumber.substring(index + 2));
        String[] prevNumber = getPrevNumber(autoNumber);

        for (String number : numbers) {
            int currentNumber = Integer.parseInt(number.trim());
            hasBonus = checkBonus(bonusNumber, currentNumber);
            matchCount += checkMatch(prevNumber, currentNumber);
        }
    }

    private static Rank setRank(int matchCount, boolean hasBonus) {
       return Arrays.stream(Rank.values())
                .filter(r -> r.getMatchingNumbers() == matchCount && r.getBonusNumbers() == hasBonus)
                .findFirst()
                .orElse(Rank.LOSER);
    }

    private static String[] getPrevNumber(String autoNumber) {
        String[] index1 = autoNumber.split("\\+");
        String[] index2 = index1[0].split(" ");

        return index2;
    }

    private static String ListToString(List<String> autoNumberResult) {

        StringBuilder sb = new StringBuilder();
        for (String number : autoNumberResult) {
            sb.append(number).append(" ");
        }
        return sb.toString().trim();
    }

    private static int checkMatch(String[] autoNumbers, int currentNumber) {
        long matchCount = Arrays.stream(autoNumbers)
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .filter(winningNumber -> winningNumber == currentNumber)
                .count();

        return (int) matchCount;
    }

    private static boolean checkBonus(int bonusNumber, int currentNumber) {
        return currentNumber == bonusNumber;
    }
}
