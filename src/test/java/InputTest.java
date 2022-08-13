import model.SimulatedLotto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InputTest {

    @Test
    public void SimulatedLottoCreateTest() {
        // given
        int number= 10;

        // when
        SimulatedLotto testLotto = new SimulatedLotto(number);

        // then
        assertEquals(testLotto.getSimulationLotto().size(), 10);
    }

    @Test
    public void failTest() {
        // given
        String n = "나숫자 아닌디ㅋ";

        // when, then
        Assertions.assertThrows(NumberFormatException.class, () -> new SimulatedLotto(Integer.parseInt(n)));
    }
}
