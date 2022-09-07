package service;

import model.Number;
import java.util.List;
import model.Lotto;
import model.User;

public class CheckLottoSimulatorService {

  private int lottoCheckCount = Number.ZERO;

  private void matchCountCheck(List<Lotto> answers, List<User> challenges) {
    for (int i = Number.ZERO; i < Number.USER_MAX_LENGTH; i++) {
      if (answers.get(i).getLotto() == challenges.get(i).getUser()) {
        lottoCheckCount++;
      }
    }
  }

  private void bonusMatchCountCheck(List<Lotto> answers, List<User> challenges){
    if (lottoCheckCount != (Number.USER_MAX_LENGTH)) {
      for (User member : challenges) {
        if (member.getUser() == answers.get(Number.USER_MAX_LENGTH).getLotto()) {
          lottoCheckCount++;
        }
      }
    }
  }

  public void setLottoCheckCount(List<Lotto> answers, List<User> challenges){
    matchCountCheck(answers, challenges);
    bonusMatchCountCheck(answers, challenges);
  }



  public void resetLottoCheckCount(){
    lottoCheckCount = Number.ZERO;
  }

  public int getLottoCheckCount() {
    return lottoCheckCount;
  }
}
