package controller;

import LottoSimulatorHandler.LottoSimulatorHandler;
import model.Number;
import service.CheckLottoSimulatorService;
import service.LottoSimulatorService;

public class LottoSimulatorController {

  private final LottoSimulatorService lottoSimulatorService = new LottoSimulatorService();
  private final LottoSimulatorHandler lottoSimulatorHandler = new LottoSimulatorHandler();

  public void runLottoSimulator(){
   lottoSimulatorService.setLottoNumbers();
   lottoSimulatorHandler.answerView(lottoSimulatorService.getCreateLottoNumbers());
  }

  public void runCheckUserResult(int loopNumber){
    for(int i= Number.ZERO; i<loopNumber;i++){
      lottoSimulatorService.runCheckUserNumber(lottoSimulatorService.getCreateLottoNumbers());
      lottoSimulatorHandler.resultLottoView(
          lottoSimulatorService.getCreateUserNumbers(),
          CheckLottoSimulatorService.lottoCheckCount);
      lottoSimulatorService.clearLottoNumbers();
      lottoSimulatorService.resetUserNumbersAndLottoCheckNumber();
    }
  }
}