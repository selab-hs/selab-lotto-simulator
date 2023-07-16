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
        Lotto lotto = new Lotto();
        NumberViewer numberViewer = new NumberViewer();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        ResultViewer resultViewer = new ResultViewer();

        int numberOfIterations = new Input().input();
        numberViewer.showAnswer(lotto.getNumbers());

        for (int i = 0; i < numberOfIterations; i++) {
            Set<Integer> randomNumber = randomNumberGenerator.getRandomNumber();

            numberViewer.showNumbers(randomNumber);

            resultViewer.showResult(
                    new Comparator()
                            .compare(randomNumber, lotto.getNumbers())
            );
        }
    }
}