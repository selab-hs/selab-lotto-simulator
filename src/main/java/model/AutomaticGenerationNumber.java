package model;

import java.util.Set;
import java.util.TreeSet;

public class AutomaticGenerationNumber {
    private final Set<Integer> simulationNumbers;

    public AutomaticGenerationNumber() {
        this.simulationNumbers = generateSimulationNumbers();
    }

    private Set<Integer> generateSimulationNumbers() {
        Set<Integer> simulationNumbers = new TreeSet<>();
        while (simulationNumbers.size() < 6) {
            simulationNumbers.add((int) (Math.random() * 45 + 1));
        }
        return simulationNumbers;
    }

    public Set<Integer> getNumbers() {
        return simulationNumbers;
    }
}
