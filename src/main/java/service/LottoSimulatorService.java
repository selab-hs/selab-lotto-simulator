package service;

import java.util.List;
import model.CreateLottoNumbers;
import model.CreateUserNumbers;
import repositroy.LottoSimulatorRepository;

public class LottoSimulatorService {
  private final LottoSimulatorRepository lottoSimulatorRepository = new LottoSimulatorRepository();
  private final CheckLottoSimulatorService checkLottoSimulatorService = new CheckLottoSimulatorService();
  private final CreateUserNumbers createUserNumbers = new CreateUserNumbers();
  private final CreateLottoNumbers createLottoNumbers = new CreateLottoNumbers();

  public void setLottoNumbers(){
    createLottoNumbers.createLotto();
  }

  public List<Integer> getCreateLottoNumbers() {
    return lottoSimulatorRepository.getLottoNumbers();
  }

  public List<Integer> getCreateUserNumbers() {
    return lottoSimulatorRepository.getUserNumbers();
  }

  public void resetUserNumbersAndLottoCheckNumber(){
    lottoSimulatorRepository.clearUserNumber();
    checkLottoSimulatorService.resetLottoCheckCount();
  }

  public void clearLottoNumbers(){
    lottoSimulatorRepository.clearLottoNumber();
  }

  public void runCheckUserNumber(List<Integer> answer) {
    createUserNumbers.createUserNumbers();
    checkLottoSimulatorService.setLottoCheckCount(answer, getCreateUserNumbers());
  }
}