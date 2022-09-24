package model;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import repositroy.LottoSimulatorRepository;

class CreateUserNumbersTest {
  @Test
  public void 유저숫자_생성Test(){

    CreateUserNumbers createUserNumbers = new CreateUserNumbers();
    LottoSimulatorRepository repository = new LottoSimulatorRepository();

    for(int i=0; i<10;i++){
      createUserNumbers.createUserNumbers();
      List<Integer> users = new ArrayList<>(repository.getUserNumbers());
      System.out.println(users);
      repository.clearLottoNumber();
    }
  }
}