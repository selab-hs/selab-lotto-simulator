import LottoSimulatorHandler.LottoSimulatorHandler;
import java.io.IOException;
import service.LottoSimulatorService;

public class LottoSimulatorApplication {
  public static void main(String[] args) throws IOException {
    LottoSimulatorHandler start = new LottoSimulatorHandler();
    start.startLotto();
  }
}