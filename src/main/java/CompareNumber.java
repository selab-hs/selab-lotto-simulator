import java.util.Arrays;
import java.util.List;

public class CompareNumber {
    private static final String[] RANKS = {"낙첨", "낙첨", "낙첨", "5등", "4등", "3등"};

    public static String compareNumber(String randomNumber, List<String> autoNumberResult) {
        int matchCount = 0;
        boolean hasBonus = false;
        checkRank(randomNumber.split(" "), ListToString(autoNumberResult), matchCount, hasBonus);
        Output.setRankResult(matchCount, hasBonus);
        Rank rank = setRank(matchCount, hasBonus);

        return rank.getDisplayName();

    }

    private static void checkRank(String[] numbers, String autoNumber, int matchCount, boolean hasBonus) {

        int index = autoNumber.indexOf("+");
        int bonusNumber = Integer.parseInt(autoNumber.substring(index + 2));
        String[] prevNumber = getPrevNumber(autoNumber);

        for (String number : numbers) {
            int currentNumber = Integer.parseInt(number.trim());
            hasBonus = checkBonus(bonusNumber, currentNumber);
            matchCount = checkMatch(prevNumber, currentNumber, matchCount);
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

    private static int checkMatch(String[] autoNumbers, int currentNumber, int matchCount) {
        for (String number : autoNumbers) {
            int winningNumber = Integer.parseInt(number.trim());
            if (currentNumber == winningNumber) {
                matchCount++;
                break;
            }
        }
        return matchCount;
    }

    private static boolean checkBonus(int bonusNumber, int currentNumber) {
        return currentNumber == bonusNumber;
    }
}
