import java.util.List;

public class Output {
    public static void startScreen(){
        System.out.print("**** Selab Lotto Simulator ****\n" +
                            "1. 시작\n" +
                            "2. 종료\n" +
                            "메뉴를 입력하시오> ");
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

    public static void printRandomNumbers(String randomNumberResult) {
        //String.join(",",autoNumberResult)
        System.out.println(randomNumberResult);
    }
}
