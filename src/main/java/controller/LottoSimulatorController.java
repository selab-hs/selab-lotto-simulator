package controller;

import LottoSimulatorHandler.LottoSimulatorHandler;
import java.util.List;
import model.Lotto;
import model.Number;
import model.User;
import service.LottoSimulatorService;

public class LottoSimulatorController {

  private final LottoSimulatorService lottoSimulatorService = new LottoSimulatorService();

  public void runLottoSimulator(){
    lottoSimulatorService.setLottoNumbers();
  }

  public void userNumbers(){
      lottoSimulatorService.setUserNumbers();
      lottoSimulatorService.rank(lottoSimulatorService.getCreateLottoNumbers(), lottoSimulatorService.getCreateUserNumbers());
  }

  public void resetMember(){
    lottoSimulatorService.resetUserNumbersAndLottoCheckNumber();
  }

  public List<Lotto> getAnswer(){
    return lottoSimulatorService.getCreateLottoNumbers();
  }

  public List<User> getChallenger(){
    return lottoSimulatorService.getCreateUserNumbers();
  }

  public int rank(List<User> Challenger){
    lottoSimulatorService.rank(getAnswer(), Challenger);
    System.out.println(lottoSimulatorService.getCreateLottoNumbers());
    return lottoSimulatorService.getLottoCheckNumber();
  }
}