import controller.LottoSimulatorController;
import java.io.IOException;
import view.InitView;
import view.OutView;

public class LottoSimulatorMachine {

  private final LottoSimulatorController lottoSimulatorController = new LottoSimulatorController();
  private final InitView initView = new InitView();
  private final OutView outView = new OutView();

  private void initOrderNumber(){
    try {
      initView.lottoMenu(initView.startView());
    } catch (IOException e) {
      System.out.println("IOException이 발생했습니다.");
    }
  }

  private int getLoopNumber() {
    return initView.getOrderNumber();
  }

  public void runSimulator(){
    while (true) {
      initOrderNumber();
      lottoSimulatorController.runLottoSimulator();
      outView.startResultView();
      lottoSimulatorController.runCheckUserResult(getLoopNumber());
      outView.endResultView();
    }
  }
}