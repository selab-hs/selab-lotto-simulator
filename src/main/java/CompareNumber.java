public class CompareNumber {
    private static final String[] RANKS = {"낙첨", "낙첨", "5등", "4등", "3등", "1등"};

    public static String compareNumber(String randomNumber, String autoNumberResult) {
        String[] autoNumbers = autoNumberResult.split("\\+");
        int bonusNumber = Integer.parseInt(autoNumbers[1].trim());
        String[] numbers = randomNumber.split(" ");
        int matchCount = 0;
        boolean hasBonus = false;

        for (String number : numbers) {
            int currentNumber = Integer.parseInt(number.trim());
            checkBonus(numbers, bonusNumber, currentNumber);
            String[] autoNumber = autoNumbers[0].split(" ");
            matchCount = checkMatch(autoNumber, currentNumber, matchCount);
        }

        String rank = RANKS[matchCount];
        if (matchCount == 4 && hasBonus == true)
            rank = "2등";


        return rank;
    }

    private static int checkMatch(String[] autoNumber, int currentNumber, int matchCount) {
        for (int i = 0; i < autoNumber.length - 1; i++) {
            //바로 아래 코드 오류
            int winningNumber = Integer.parseInt(autoNumber[i].trim());
            if (currentNumber == winningNumber) {
                return matchCount + 1;
            }
        }
        return matchCount;
    }

    private static boolean checkBonus(String[] numbers, int bonusNumber, int currentNumber) {
        for (String number : numbers) {

            if (currentNumber == bonusNumber) {
                return true;
            }
        }
        return false;
    }
}
