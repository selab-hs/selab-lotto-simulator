import java.util.List;

public class Output {
    private static int[] ranks = new int[6];

    public static void startScreen(){
        System.out.print("**** Selab Lotto Simulator ****\n" +
                            "1. 시작\n" +
                            "2. 종료\n" +
                            "메뉴를 입력하시오> ");
    }

    public static void ExitScreen(){
        for(int i = 0 ; i < ranks.length - 1; i++){
            System.out.print((i + 1) + "등 : " + ranks[i] +", ");
        }
        System.out.println("낙첨 : " + ranks[5]);
        System.out.println("************* END *************");
        System.exit(0);
    }

    public static void autoNumberScreen(List<String> autoNumberResult) {
        StringBuilder sb = new StringBuilder();
        for (String value : autoNumberResult) {
            sb.append(value).append(" ");
        }
        String result = sb.toString().trim();

        System.out.println("*********** 당첨 번호 ***********");
        System.out.println(result);
    }
    public static void randomNumberScreen() {
        System.out.println("********* 자동 생성 번호 *********");

    }

    public static void printRandomNumbers(String number, String rank) {
        //String.join(",",autoNumberResult)
        String randomNumberResult = number + "  -> " + rank;
        System.out.println(randomNumberResult);
    }

    public static void setRankResult(int matchCount, boolean hasBonus) {
        switch (matchCount) {
            case 6:
                ranks[0]++; // 1등
                break;
            case 5:
                if (hasBonus) {
                    ranks[1]++; // 2등
                } else {
                    ranks[2]++; // 3등
                }
                break;
            case 4:
                ranks[3]++; // 4등
                break;
            case 3:
                ranks[4]++; // 5등
                break;
            default:
                ranks[5]++; // 낙첨
                break;
        }
    }
}
