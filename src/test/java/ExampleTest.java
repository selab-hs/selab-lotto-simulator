import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 확인 후 해당 파일을 삭제하시기 바랍니다.
 */
public class ExampleTest {
    private Example example;

    @Test
    public void 성공_테스트() {
        // given
        String n = "10";
        example = new Example(n);

        // when
        int actual = example.getN();
        int expected = 10;

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void 실패_테스트() {
        // given
        String n = "나숫자 아닌디ㅋ";

        // when, then
        Assertions.assertThrows(NumberFormatException.class, () -> example = new Example(n));
    }
}
