package view;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import model.CreateUserNumbers;
import org.junit.jupiter.api.Test;
import repositroy.LottoSimulatorRepository;
import service.CheckLottoSimulatorService;

class OutViewTest {

  @Test
  void userNumberView() {
    OutView outView = new OutView();
    CreateUserNumbers createUserNumbers = new CreateUserNumbers();
    LottoSimulatorRepository repository = new LottoSimulatorRepository();

    for (int i = 0; i < 10; i++) {
      createUserNumbers.createUserNumbers();
      outView.duplicatedCheckNumberView(repository.getUserNumbers(), CheckLottoSimulatorService.lottoCheckCount);
      repository.clearLottoNumber();
      repository.clearUserNumber();
    }
  }
}