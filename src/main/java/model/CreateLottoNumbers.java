package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateLottoNumbers implements CreateNumbers {

  public List<Lotto> createLotto(){
    List<Lotto> lottoNumbers = new ArrayList<>();
    List<Integer> answer = new ArrayList<>(createNumbers(Number.LOTTO_MAX_LENGTH, new Random()));
    for(int member:answer){
      lottoNumbers.add(new Lotto(member));
    }
    return lottoNumbers;
  }
}