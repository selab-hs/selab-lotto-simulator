import java.io.IOException;

public class LottoSimulatorApplication {
  public static void main(String[] args) throws IOException {
    LottoSimulatorMachine start = new LottoSimulatorMachine();
    start.runSimulator();
  }
}