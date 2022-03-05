/**
 * 확인 후 해당 파일을 삭제하시기 바랍니다.
 */
public class Example {
    private final int n;

    public Example(String numStr) {
        this.n = validParseInt(numStr);
    }

    private int validParseInt(String numStr) {
        return Integer.parseInt(numStr);
    }

    public int getN() {
        return n;
    }
}
