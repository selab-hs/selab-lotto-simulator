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
    start();
    lottoSimulatorController.runLottoSimulator();
    outView.answer();
    answerPrint(lottoSimulatorController.getAnswer());
    outView.endResultView();
    outView.startResultView();
    for(int i=0; i<initView.getOrderNumber();i++){
      lottoSimulatorController.userNumbers();
      rankPrint(lottoSimulatorController.getChallenger(), lottoSimulatorController.rank(lottoSimulatorController.getChallenger()));
      lottoSimulatorController.resetMember();
    }
    outView.endResultView();
  }

  public void start() throws IOException {
    initView.lottoMenu(initView.startView());
  }

  public void rankPrint(List<User> userNumbers, int rank){
    outView.numbersView(userNumbers);
    outView.rank(rank);
  }

  public void answerPrint(List<Lotto> lottoNumbers){
    outView.answerView(lottoNumbers);
  }

  public void startLotto() throws IOException {
    while(true){
      viewResolver();
    }
  }
}