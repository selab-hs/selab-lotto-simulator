package service;

import java.util.ArrayList;
import java.util.List;
import model.Number;

public class CheckLottoSimulatorService {

  public static int lottoCheckCount = Number.ZERO;

  private void matchCountCheck(List<Integer> answers, List<Integer> challenges) {
    for (int i = Number.ZERO; i < Number.USER_MAX_LENGTH; i++) {
      if (answers.get(i).equals(challenges.get(i))) {
        lottoCheckCount++;
      }
    }
  }

  private void bonusMatchCountCheck(List<Integer> answers, List<Integer> challenges) {
    if (lottoCheckCount != (Number.USER_MAX_LENGTH)) {
      if(challenges.contains(answers.get(answers.size() - Number.ONE))){
        lottoCheckCount++;
      }
    }
  }

  private Integer duplicatedSize(List<Integer> challenges, List<Integer> answers){
    List<Integer> duplicated = new ArrayList<>(challenges);
    duplicated.retainAll(answers);
    return duplicated.size();
  }

  public void setLottoCheckCount(List<Integer> answers, List<Integer> challenges) {
    if (duplicatedSize(challenges, answers)> 1) {
      matchCountCheck(answers, challenges);
      bonusMatchCountCheck(answers, challenges);
    }
    if (duplicatedSize(challenges, answers) <= 2) {
      resetLottoCheckCount();
    }
  }

  public void resetLottoCheckCount() {
    lottoCheckCount = Number.ZERO;
  }
}