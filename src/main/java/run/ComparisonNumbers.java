package run;

import model.AutomaticGenerationNumber;
import model.SimulationNumbers;
import model.WinningNumber;

import java.util.ArrayList;
import java.util.List;

public class ComparisonNumbers {
    private final List<AutomaticGenerationNumber> simulationNumbers;
    private List<String> simulationResults;

    public ComparisonNumbers(WinningNumber winningNumber, SimulationNumbers simulationNumbers) {
        this.simulationNumbers = simulationNumbers.getSimulationNumbers();
        this.simulationResults = compareRepeatedResult(winningNumber);
    }

    private List<String> compareRepeatedResult(WinningNumber winningNumber) {
        List<String> simulationResults = new ArrayList<>();

        for (int i = 0; i < simulationNumbers.size(); i++) {
            int winningResult=0;
            for(int j=0; j<winningNumber.getNumbers().size();i++){
                // 해당 랜덤 시뮬레이션 한 값들과 당첨번호 결과 비교후 해당 결과를 simulationResults에 하나씩 넣을 예정 -> 이후 해당 값들을 return 해서 출력 예정
            }
        }
        return simulationResults;
    }
}
