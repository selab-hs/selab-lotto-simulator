package run;

import model.SimulatedLotto;
import model.WinningNumber;
import model.WinningResult;

import java.util.ArrayList;
import java.util.List;

public class ComparisonNumbers {
    private final List<String> simulationResults;

    public ComparisonNumbers(WinningNumber winningNumber, SimulatedLotto simulationLotto) {
        this.simulationResults = compareRepeatedResult(winningNumber, simulationLotto);
    }

    private List<String> compareRepeatedResult(WinningNumber winningNumber, SimulatedLotto simulatedLotto) {
        List<String> simulationResults = new ArrayList<>();

        for (int i = 0; i < simulatedLotto.getSimulationLotto().size(); i++) {
            List<Integer> numbers = simulatedLotto.getSimulationLotto().get(i).getNumbers();

            simulationResults.add(toStringResult(getWinningResult(numbers, winningNumber), getBonusWinningResult(numbers, winningNumber)));
        }
        return simulationResults;
    }

    private int getWinningResult(List<Integer> simulatedLottoNumbers, WinningNumber winningNumber) {
        int winningResult = 0;
        for (Integer lottoNumber : simulatedLottoNumbers) {
            if (winningNumber.getNumbers().contains(lottoNumber)) {
                winningResult++;
            }
        }
        return winningResult;
    }

    private boolean getBonusWinningResult(List<Integer> simulatedLottoNumbers, WinningNumber winningNumber) {
        return simulatedLottoNumbers.contains(winningNumber.getBonusNumber());
    }

    private String toStringResult(int winningNumber, boolean bonusWinning) {
        return WinningResult.getResult(winningNumber, bonusWinning);
    }

    public List<String> getSimulationLottoResult() {
        return simulationResults;
    }

}
