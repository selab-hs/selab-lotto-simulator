package view;

import model.SimulatedLotto;
import model.SimulatedLottoNumber;
import run.ComparisonNumbers;

import java.util.Set;

public class OutputScreen {
    public void runSimulator() {
        System.out.println("**** Selab Lotto Simulator ****");
        System.out.println("1. 시작");
        System.out.println("2. 종료");
        System.out.print("메뉴를 입력하시오 > ");
    }

    public void receivedInputNumber() {
        System.out.print("시뮬레이션 할 복권 수를 입력하시오 > ");
    }

    public void inputError() {
        System.out.println("잘못된 입력요청 -> 다시 입력해주세요 : ");
    }

    public void outputWinningNumber(Set<Integer> winningNumbers, int winningBonusNumber) {
        System.out.println("*********** 당첨 번호 ***********");
        for (Integer winningNumber : winningNumbers) {
            System.out.print(winningNumber + " ");
        }
        System.out.println("+ " + winningBonusNumber);
    }

    public void outputSimulatorResult(SimulatedLotto simulatedLotto, ComparisonNumbers comparisonNumbers) {
        int i = 0;
        System.out.println("********* 자동 생성 번호 *********");
        for (SimulatedLottoNumber SimulatedLottoNumber : simulatedLotto.getSimulationLotto()) {
            for (int number : SimulatedLottoNumber.getNumbers()) {
                System.out.print(number + " ");
            }
            System.out.println("-> " + comparisonNumbers.getSimulationLottoResult().get(i));
            i++;
        }
        System.out.println("*******************************");
    }

    public void endSimulator() {
        System.out.println("************* END *************");
    }
}
