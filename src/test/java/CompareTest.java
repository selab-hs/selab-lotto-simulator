import model.WinningResult;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareTest {

    @Test
    public void WinningCompareTest() {
        // given
        List<Integer> simulationNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7));
        Set<Integer> winningNumbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int bonusNumber = 7;
        WinningNumberTest winningNumberTest = new WinningNumberTest(winningNumbers, bonusNumber);

        // when
        String result = WinningResult.getResult(
                Math.toIntExact(
                        simulationNumbers.stream()
                                .filter((value) -> winningNumberTest.winningNumbers().contains(value))
                                .count()
                ),
                simulationNumbers.contains(winningNumberTest.winningBonusNumber())
        );

        // then
        assertEquals("2등", result);
    }
}

record WinningNumberTest(Set<Integer> winningNumbers, int winningBonusNumber) {
}