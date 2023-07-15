package run;

import model.SimulatedLotto;
import model.WinningNumber;
import model.WinningResult;

import java.util.List;
import java.util.stream.Collectors;

public class ComparisonNumbers {
    private final List<String> simulationResults;

    public ComparisonNumbers(WinningNumber winningNumber, SimulatedLotto simulationLotto) {
        this.simulationResults = compareRepeatedResult(winningNumber, simulationLotto);
    }

    private List<String> compareRepeatedResult(WinningNumber winningNumber, SimulatedLotto simulatedLotto) {
        return simulatedLotto.getSimulationLotto().stream()
                .map(value -> toStringResult(getWinningResult(value.getNumbers(), winningNumber), getBonusWinningResult(value.getNumbers(), winningNumber)))
                .collect(Collectors.toList());
    }

    private int getWinningResult(List<Integer> simulatedLottoNumbers, WinningNumber winningNumber) {
        return Math.toIntExact(
                simulatedLottoNumbers.stream()
                        .filter((value) -> winningNumber.getNumbers().contains(value))
                        .count()
        );
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
