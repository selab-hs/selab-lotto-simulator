package controller;

import LottoSimulatorHandler.LottoSimulatorHandler;
import java.util.List;
import model.Lotto;
import model.Number;
import service.LottoSimulatorService;

public class LottoSimulatorController {

  private final LottoSimulatorService lottoSimulatorService = new LottoSimulatorService();
  private final LottoSimulatorHandler lottoSimulatorHandler = new LottoSimulatorHandler();

  public void runLottoSimulator(int orderNumber){
    lottoSimulatorService.setLottoNumbers();
  }

  public void userNumbers(int orderNumber){
    for(int i = Number.ZERO;i<orderNumber;i++){
      lottoSimulatorService.setUserNumbers();
      lottoSimulatorService.rank(lottoSimulatorService.getCreateLottoNumbers(), lottoSimulatorService.getCreateUserNumbers());
      lottoSimulatorHandler.rankPrint(lottoSimulatorService.getCreateUserNumbers(), lottoSimulatorService.getLottoCheckNumber());
      lottoSimulatorService.resetUserNumbersAndLottoCheckNumber();
    }
  }

  public List<Lotto> getAnswer(){
    return lottoSimulatorService.getCreateLottoNumbers();
  }

}
