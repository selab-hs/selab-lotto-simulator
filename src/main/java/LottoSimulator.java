import model.SimulatedLotto;
import model.WinningNumber;
import run.ComparisonNumbers;
import view.InputValue;
import view.OutputScreen;

public class LottoSimulator {
    public final static int SIMULATOR_RUN = 1, SIMULATOR_END = 2, SYSTEM_EXIT = 0;

    public static void main(String[] args) {
        OutputScreen outputConsole = new OutputScreen();
        InputValue inputConsole = new InputValue(outputConsole);

        outputConsole.runSimulator();
        int runNumber = inputConsole.inputStartNumber();

        if (runNumber == SIMULATOR_RUN) {
            WinningNumber winningNumber = new WinningNumber();

            outputConsole.receivedInputNumber();
            int inputLoopNumber = inputConsole.inputSimulationLoopNumber();
            SimulatedLotto simulatedLotto = new SimulatedLotto(inputLoopNumber);

            outputConsole.outputWinningNumber(winningNumber.getNumbers(), winningNumber.getBonusNumber());
            ComparisonNumbers comparisonNumbers = new ComparisonNumbers(winningNumber, simulatedLotto);

            outputConsole.outputSimulatorResult(simulatedLotto, comparisonNumbers);
            main(args);
        }

        if (runNumber == SIMULATOR_END) {
            outputConsole.endSimulator();
            System.exit(SYSTEM_EXIT);
        }
    }
}
