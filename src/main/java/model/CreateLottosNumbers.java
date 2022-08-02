package model;

import domain.Number;
import java.util.ArrayList;
import java.util.List;
import service.CreateNumbersService;

public class CreateLottosNumbers extends CreateNumbersService {
  private List<Lotto> lottos = new ArrayList<>();

  @Override
  public List<Integer> getNumbers(int length) {
    return super.getNumbers(length);
  }

  private void lottos(){
    List<Integer> answer = new ArrayList<>(getNumbers(Number.LOTTO_MAX_LENGTH));
    for(int member:answer){
      lottos.add(new Lotto(member));
    }
  }

  public void createLottos(){
    lottos();
  }

  public List<Lotto> getLottos(){
    return lottos;
  }
}
