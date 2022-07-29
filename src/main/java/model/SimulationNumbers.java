package model;

import java.util.ArrayList;
import java.util.List;

public class SimulationNumbers {

    private final List<AutomaticGenerationNumber> simulationNumbers;

    public SimulationNumbers(int number){
        this.simulationNumbers = generateRepeatNumber(number);
    }

    private List<AutomaticGenerationNumber> generateRepeatNumber(int number){
        List<AutomaticGenerationNumber> simulationNumbers = new ArrayList<>();
        for(int i=0; i<number; i++){
            simulationNumbers.add(new AutomaticGenerationNumber());
        }
        return simulationNumbers;
    }

    public List<AutomaticGenerationNumber> getSimulationNumbers(){
        return simulationNumbers;
    }
}
