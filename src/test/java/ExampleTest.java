import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 확인 후 해당 파일을 삭제하시기 바랍니다.
 */
public class ExampleTest {
    @DisplayName("입력 값에 따른 로또 개수 확인")
    @Test
    public void testLottoNumberGenerationCount() {
        // given
        int given = 10;

        // when
        RandomNumber randomNumber = new RandomNumber(given);
        List<String> lottoNumber = RandomNumber.createRandomNumbers(given);
        int actual = lottoNumber.size();
        int expected = 20;

        // then
        assertEquals(expected, actual);
    }

    @DisplayName("랜덤 번호 개수 확인")
    @Test
    public void testRandomNumberCount() {
        // given
        int given = 1;

        // when
        RandomNumber randomNumber = new RandomNumber(given);
        List<String> lottoNumber = RandomNumber.createRandomNumbers(given);
        String number = lottoNumber.get(0);
        int actual = number.length();
        int expected = 7;

        // then
        assertEquals(expected, actual);
    }

    @DisplayName("번호 비교 로직 확인")
    @Test
    public void testCompareNumber() {

    }
}
