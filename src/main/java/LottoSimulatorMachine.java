import controller.LottoSimulatorController;
import java.io.IOException;
import view.InitView;
import view.OutView;

public class LottoSimulatorMachine {

  private final LottoSimulatorController lottoSimulatorController = new LottoSimulatorController();
  private final InitView initView = new InitView();
  private final OutView outView = new OutView();

  private void initOrderNumber() throws IOException {
    initView.lottoMenu(initView.startView());
  }

  private int getLoopNumber() {
    return initView.getOrderNumber();
  }

  public void runSimulator() throws IOException {
    for(;;){
      initOrderNumber();
      lottoSimulatorController.runLottoSimulator();
      outView.startResultView();
      lottoSimulatorController.runCheckUserResult(getLoopNumber());
      outView.endResultView();
    }
  }
}