package model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimulatedLottoNumber {
    private final List<Integer> simulationNumbers;

    public SimulatedLottoNumber() {
        this.simulationNumbers = generateSimulationNumbers();
    }

    private List<Integer> generateSimulationNumbers() {
        return Stream.generate(() -> (int) (Math.random() * 45 + 1))
                .distinct()
                .limit(6)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Integer> getNumbers() {
        return simulationNumbers;
    }
}
