import model.SimulationNumbers;
import model.WinningNumber;
import run.ComparisonNumbers;
import view.InputValue;
import view.OutputScreen;

public class LottoSimulator {
    private final static int SIMULATOR_RUN = 1, SIMULATOR_END = 2, SYSTEM_EXIT = 0;

    public static void main(String[] args) {
        OutputScreen outputConsole = new OutputScreen();
        InputValue inputConsole = new InputValue();

        outputConsole.runSimulator();
        int runNumber = inputConsole.inputStartNumber();

        if (runNumber == SIMULATOR_RUN) {
            WinningNumber winningNumber = new WinningNumber();

            outputConsole.receivedInputNumber();
            int inputLoopNumber = inputConsole.inputSimulationLoopNumber();
            SimulationNumbers simulationNumber =new SimulationNumbers(inputLoopNumber);

            outputConsole.outputWinningNumber(winningNumber.getNumbers(), winningNumber.getBonusNumber());
            ComparisonNumbers comparisonNumbers = new ComparisonNumbers(winningNumber, simulationNumber);

            outputConsole.outputSimulatorResult();

        }

        if (runNumber == SIMULATOR_END) {
            outputConsole.endSimulator();
            System.exit(SYSTEM_EXIT);
        }
    }
}
