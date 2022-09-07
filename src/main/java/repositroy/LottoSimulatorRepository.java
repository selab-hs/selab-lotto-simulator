package repositroy;

import java.util.ArrayList;
import java.util.List;
import model.Lotto;
import model.User;

public class LottoSimulatorRepository {
  List<User> userNumbers = new ArrayList<>();
  List<Lotto> lottoNumbers = new ArrayList<>();

  public void setUserNumbers(List<User> numbers){
    userNumbers.addAll(numbers);
  }

  public void setLottoNumbers(List<Lotto> numbers){
    lottoNumbers.addAll(numbers);
  }

  public List<Lotto> getLottoNumbers() {
    return lottoNumbers;
  }

  public List<User> getUserNumbers() {
    return userNumbers;
  }

  public void clearUserNumber(){
    userNumbers.clear();
  }
}
