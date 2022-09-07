package service;

import java.util.List;
import model.CreateLottoNumbers;
import model.CreateUserNumbers;
import model.Lotto;
import model.User;
import repositroy.LottoSimulatorRepository;

public class LottoSimulatorService {
  private final LottoSimulatorRepository lottoSimulatorRepository = new LottoSimulatorRepository();
  private final CheckLottoSimulatorService checkLottoSimulatorService = new CheckLottoSimulatorService();
  private final CreateUserNumbers createUserNumbers = new CreateUserNumbers();
  private final CreateLottoNumbers createLottoNumbers = new CreateLottoNumbers();

  public void setLottoNumbers(){
    lottoSimulatorRepository.setLottoNumbers(createLottoNumbers.createLotto());
  }

  public void setUserNumbers(){
    lottoSimulatorRepository.setUserNumbers(createUserNumbers.createUserNumbers());
  }

  public List<Lotto> getCreateLottoNumbers() {
    return lottoSimulatorRepository.getLottoNumbers();
  }

  public List<User> getCreateUserNumbers() {
    return lottoSimulatorRepository.getUserNumbers();
  }

  public void rank(List<Lotto> answer, List<User> challenger){
    checkLottoSimulatorService.setLottoCheckCount(answer, challenger);
  }

  public int getLottoCheckNumber(){
    return checkLottoSimulatorService.getLottoCheckCount();
  }

  public void resetUserNumbersAndLottoCheckNumber(){
    lottoSimulatorRepository.clearUserNumber();
    checkLottoSimulatorService.resetLottoCheckCount();
  }
}