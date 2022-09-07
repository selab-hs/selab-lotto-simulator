import LottoSimulatorHandler.LottoSimulatorHandler;
import java.io.IOException;

public class LottoSimulatorApplication {
  public static void main(String[] args) throws IOException {
    LottoSimulatorHandler start = new LottoSimulatorHandler();
    start.startLotto();
  }
}