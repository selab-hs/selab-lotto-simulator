package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Lotto;
import model.User;
import repositroy.LottoSimulatorRepository;
import service.CheckLottoService;

public class LottoController {
  private final LottoSimulatorRepository lottoSimulatorRepository = new LottoSimulatorRepository();
  private final CheckLottoService checkLottoService = new CheckLottoService();

  public List<Lotto> setLottoSimulator(){
    lottoSimulatorRepository.createLottos();
    return lottoSimulatorRepository.lottos();
  }

  public void endLottoSimulator(int initNumber){
    if(initNumber ==2){
      System.out.println();
      System.exit(0);
    }
  }

  public Map<Integer, List<User>> results(int initNumber){
    Map<Integer, List<User>> result = new HashMap<>();
    for(int i=0; i<initNumber;i++){
      List<User> member = new ArrayList<>(lottoSimulatorRepository.users());
      checkLottoService.setLottoCheckCount(lottoSimulatorRepository.lottos(),member);
      result.put(checkLottoService.getLottoCheckCount(), member);
      checkLottoService.resetLottoCheckCount();
    }
  return result;
  }

}
