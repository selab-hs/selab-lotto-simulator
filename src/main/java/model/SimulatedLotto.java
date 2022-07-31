package model;

import java.util.ArrayList;
import java.util.List;

public class SimulatedLotto {

    private final List<SimulatedLottoNumber> simulationLotto;

    public SimulatedLotto(int number) {
        this.simulationLotto = generateRandomLotto(number);
    }

    private List<SimulatedLottoNumber> generateRandomLotto(int number) {
        List<SimulatedLottoNumber> simulationNumbers = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            simulationNumbers.add(new SimulatedLottoNumber());
        }
        return simulationNumbers;
    }

    public List<SimulatedLottoNumber> getSimulationLotto() {
        return simulationLotto;
    }
}
