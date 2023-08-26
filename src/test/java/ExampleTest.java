import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        // given
        List<String> randomNumber = new ArrayList<String>();
        randomNumber.add("1 2 3 4 5 6 13");
        String autoNumber = "1 3 2 5 6 9 11"; // 두개 동일

        // when
        CompareNumber compareNumber = new CompareNumber();
        boolean actual = CompareNumber.checkRank(randomNumber, autoNumber);
        boolean expected = true;

        // then
        assertEquals(actual,expected);
    }

    @DisplayName("로또 번호 값이 1~45의 중복되지 않는 값을 지키는 지 확인")
    @Test
    public void testValid() {
        // given

        List<String> given = new ArrayList<String>();
        given.add("1 2 3 4 5 6 + 7");

        // when
        AutoNumber autoNumber = new AutoNumber();
        List<String> autoNumberResult = AutoNumber.createAutoNumberResult(AutoNumber.createRandomNumbers());

        boolean actual = checkDuplicatedNumber(autoNumberResult);
        boolean expected = false;
        // then
        //비교 로직 생각
        assertEquals(actual,expected);
    }

    private boolean checkDuplicatedNumber(List<String> autoNumberResult) {
        boolean result = false;
        for(int i = 0 ; i < autoNumberResult.size() ; i++)
        for(String number : autoNumberResult){
            result = autoNumberResult.get(i).equals(number);
        }
        return result;
    }


}
