package model;

import java.util.ArrayList;
import java.util.List;

public class CreateLottosNumbers extends CreateNumbersService {

  @Override
  public List<Integer> getNumbers(int length) {
    return super.getNumbers(length);
  }

  public List<Lotto> createLotto(){
    List<Lotto> lottoNumbers = new ArrayList<>();
    List<Integer> answer = new ArrayList<>(getNumbers(Number.LOTTO_MAX_LENGTH));
    for(int member:answer){
      lottoNumbers.add(new Lotto(member));
    }
    return lottoNumbers;
  }
}
