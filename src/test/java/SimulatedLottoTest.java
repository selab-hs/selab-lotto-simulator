import model.SimulatedLotto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimulatedLottoTest {
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
        String n = "숫자로 변환 불가능한 문자열";

        // when, then
        assertThrows(NumberFormatException.class, () -> new SimulatedLotto(Integer.parseInt(n)));
    }
}
