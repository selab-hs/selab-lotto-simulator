package model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimulatedLotto {

    private final List<SimulatedLottoNumber> simulationLotto;

    public SimulatedLotto(int number) {
        this.simulationLotto = generateRandomLotto(number);
    }

    private List<SimulatedLottoNumber> generateRandomLotto(int number) {
        return Stream.generate(SimulatedLottoNumber::new)
                .limit(number)
                .collect(Collectors.toList());
    }

    public List<SimulatedLottoNumber> getSimulationLotto() {
        return simulationLotto;
    }
}
