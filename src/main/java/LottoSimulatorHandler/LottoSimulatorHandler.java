package LottoSimulatorHandler;

import java.util.List;
import view.OutView;

public class LottoSimulatorHandler {
  private final OutView outView = new OutView();

  public void answerView(List<Integer> answer){
    outView.answerNumberView(answer);
  }

  public void resultLottoView(List<Integer> userNumbers, int rank){
    outView.duplicatedCheckNumberView(userNumbers, rank);
  }
}