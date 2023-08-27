import java.util.List;

public class Output {
    public static void startScreen(){
        System.out.print("**** Selab Lotto Simulator ****\n" +
                            "1. 시작\n" +
                            "2. 종료\n" +
                            "메뉴를 입력하시오> ");
    }

    public static void exitScreen() {
        int totalRanks = Rank.ranks.size();

        for (int i = 0; i < totalRanks - 1; i++) {
            System.out.print((i + 1) + "등 : " + Rank.ranks.get(i) + ", ");
        }
        System.out.println("낙첨 : " + Rank.ranks.get(5));
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


}
