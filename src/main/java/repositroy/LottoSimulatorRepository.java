package repositroy;

import java.util.ArrayList;
import java.util.List;

public class LottoSimulatorRepository {
   private static final List<Integer> userNumbers = new ArrayList<>();
   private static final List<Integer> lottoNumbers = new ArrayList<>();

  public void setUserNumbers(List<Integer> numbers){
    userNumbers.addAll(numbers);
  }

  public void setLottoNumbers(List<Integer> numbers){
    lottoNumbers.addAll(numbers);
  }

  public List<Integer> getLottoNumbers() {
    return lottoNumbers;
  }

  public List<Integer> getUserNumbers() {
    return userNumbers;
  }

  public void clearUserNumber(){
    userNumbers.clear();
  }

  public void clearLottoNumber(){
    lottoNumbers.clear();
  }
}