import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import view.InputValue;
import view.OutputView;

public class InputTest {

    @Test
    public void startNumberInputTest(){
        // given
        OutputView outputView = new OutputView();
        InputValue inputView = new InputValue(outputView);

        // when
        int result = inputView.inputStartNumber(2);

        // then
        Assertions.assertTrue(result == 1 || result == 2);
    }

    @Test
    public void simulationLoopNumberInputTest(){
        // given
        OutputView outputView = new OutputView();
        InputValue inputView = new InputValue(outputView);

        // when
        int result = inputView.inputSimulationLoopNumber(1000);

        // then
        Assertions.assertTrue(result >= 0 && result <= 1000);
    }
}
