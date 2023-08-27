import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {
    public static int getInputValue() {
        Scanner scanner = new Scanner(System.in);
        return isValidInput(scanner.nextInt());
    }

    public static int getSimulatorInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("시뮬레이션 할 복권 수를 입력하시오> ");
        return isNum(scanner.nextInt());
    }

    protected static int isNum(int inputNum) {
        try {
            String str = String.valueOf(inputNum);
            if (!Pattern.matches("^[0-9]{1,2}$", str))
                throw new NumberFormatException("입력된 숫자가 2자리 숫자를 넘겼어요.(최대 99)");
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException : " + e.getMessage());
            System.exit(0);
        }
        return inputNum;
    }

    public static int isValidInput(int value) {
        try {
            if (!Pattern.matches("^\\d$", Integer.toString(value)))
                throw new NumberFormatException("입력된 숫자는 1자리 숫자가 아닙니다.");
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException : " + e.getMessage());
            System.exit(0);
        }
        return value;
    }
}
