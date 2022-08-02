package repositroy;

import java.util.ArrayList;
import java.util.List;
import model.CreateLottosNumbers;
import model.CreateUserNumbers;
import model.Lotto;
import model.User;

public class LottoSimulatorRepository {
  CreateLottosNumbers lottos = new CreateLottosNumbers();

  private final List<Lotto> answers = new ArrayList<>();

  public void createLottos(){
    lottos.createLottos();
    answers.addAll(lottos.getLottos());
  }

  public List<Lotto> lottos(){
    return answers;
  }

  public List<User> users(){
    CreateUserNumbers users = new CreateUserNumbers();
    users.createUsers();
    return users.getUsers();
  }

}
