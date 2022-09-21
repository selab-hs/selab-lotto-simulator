package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import model.Number;

public class CheckLottoSimulatorService {

  public static int lottoCheckCount = Number.ZERO;

  private void matchCountCheck(List<Integer> answers, List<Integer> challenges) {
    for (int i = Number.ZERO; i < Number.USER_MAX_LENGTH; i++) {
      if (Objects.equals(answers.get(i), challenges.get(i))) {
        lottoCheckCount++;
      }
    }
  }

  private void bonusMatchCountCheck(List<Integer> answers, List<Integer> challenges) {
    if ((lottoCheckCount != (Number.USER_MAX_LENGTH)) &&
        challenges.contains(answers.get(answers.size() - Number.ONE))) {
      lottoCheckCount++;
    }
  }

  public void setLottoCheckCount(List<Integer> answers, List<Integer> challenges) {
    List<Integer> duplicated = new ArrayList<>(challenges);
    duplicated.retainAll(answers);
    if (duplicated.size() > 1) {
      matchCountCheck(answers, challenges);
      bonusMatchCountCheck(answers, challenges);
    }
    if (duplicated.size() < 2) {
      resetLottoCheckCount();
    }
  }

  public void resetLottoCheckCount() {
    lottoCheckCount = Number.ZERO;
  }
}