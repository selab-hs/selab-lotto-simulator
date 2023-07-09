import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {
    public static int getInputValue(){
        Scanner scanner = new Scanner(System.in);
        return isValidInput(scanner.nextInt());
    }

    public static int isValidInput(int value) {
        try {
            if (!Pattern.matches("^\\d$",  Integer.toString(value)))
                throw new NumberFormatException("입력된 숫자는 1자리 숫자가 아닙니다.");
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException : " + e.getMessage());
            System.exit(0);
        }
        return value;
    }
}
