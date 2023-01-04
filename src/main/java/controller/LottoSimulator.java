package controller;

import model.Lotto;
import service.Comparator;
import service.Input;
import service.RandomNumberGenerator;
import view.NumberViewer;
import view.ResultViewer;

import java.util.Set;

public class LottoSimulator {
    public void simulatorStart() {
        int numberOfIterations = new Input().input();
        Lotto lotto = new Lotto();
        new NumberViewer().showAnswer(lotto.getNumbers());
        for (int i = 0; i < numberOfIterations; i++) {
            Set<Integer> randomNumber = new RandomNumberGenerator().getRandomNumber();
            new NumberViewer().showNumbers(randomNumber);
            int result = new Comparator().compare(randomNumber, lotto.getNumbers());
            new ResultViewer().showResult(result);
        }
    }
}