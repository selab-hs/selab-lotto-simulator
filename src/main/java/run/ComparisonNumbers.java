package run;

import model.SimulatedLotto;
import model.WinningNumber;

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
            int winningResult = 0;
            boolean bonusWinning = simulatedLotto.getSimulationLotto().get(i).getNumbers().contains(winningNumber.getBonusNumber());
            for (Integer integer : simulatedLotto.getSimulationLotto().get(i).getNumbers()) {
                if (winningNumber.getNumbers().contains(integer)) {
                    winningResult++;
                }
            }

            simulationResults.add(toStringResult(winningResult, bonusWinning));
        }
        return simulationResults;
    }

    private String toStringResult(int winningNumber, boolean bonusWinning) {
        switch (winningNumber) {
            case 6:
                return "1등";
            case 5:
                if (bonusWinning) {
                    return "2등";
                }
                return "3등";
            case 4:
                return "4등";
            case 3:
                return "5등";
            default:
                return "낙첨";
        }
    }

    public List<String> getSimulationLottoResult() {
        return simulationResults;
    }

}
