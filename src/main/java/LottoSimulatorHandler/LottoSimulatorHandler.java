package LottoSimulatorHandler;

import controller.LottoSimulatorController;
import java.io.IOException;
import java.util.List;
import model.Lotto;
import model.User;
import view.InitView;
import view.OutView;

public class LottoSimulatorHandler {
  LottoSimulatorController lottoSimulatorController = new LottoSimulatorController();
  InitView initView = new InitView();
  OutView outView = new OutView();

  public void viewResolver() throws IOException {
    lottoSimulatorController.runLottoSimulator(start());
    outView.answer();
    answerPrint(lottoSimulatorController.getAnswer());
    outView.endResultView();
    outView.startResultView();
    lottoSimulatorController.userNumbers(initView.getOrderNumber());
    outView.endResultView();
  }

  public int start() throws IOException {
    initView.lottoMenu(initView.startView());
    return initView.getOrderNumber();
  }

  public void rankPrint(List<User> userNumbers, int rank){
    outView.numbersView(userNumbers);
    outView.rank(rank);
  }

  public void answerPrint(List<Lotto> lottoNumbers){
    outView.answerView(lottoNumbers);
  }

  public void startLotto() throws IOException {
    for(;;){
      viewResolver();
    }
  }
}


