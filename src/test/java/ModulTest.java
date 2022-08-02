import model.CreateLottosNumbers;
import model.CreateUserNumbers;
import org.junit.jupiter.api.Test;
import repositroy.LottoSimulatorRepository;
import service.CheckLottoService;

public class ModulTest {

  @Test
  public void  LottoCheck()throws Exception{
    //given
    LottoSimulatorRepository lottoSimulatorRepository = new LottoSimulatorRepository();
    CheckLottoService checkLottoService = new CheckLottoService();
    //when
      checkLottoService.setLottoCheckCount(lottoSimulatorRepository.lottos(),lottoSimulatorRepository.users());
    //tnen
      checkLottoService.getLottoCheckCount();

  }

  @Test
  public void createUsersTest() throws Exception{
    //given
    CreateUserNumbers createUserNumbers = new CreateUserNumbers();
    //when
    createUserNumbers.createUsers();
    //tnen
    createUserNumbers.getUsers();
  }
    @Test
    public void createLottoNumbersTest() throws Exception{
      //given
      CreateLottosNumbers createLottosNumbers = new CreateLottosNumbers();
      //when
      createLottosNumbers.createLottos();
      //tnen
      createLottosNumbers.getLottos();
    }


}
