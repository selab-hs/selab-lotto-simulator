import model.CreateLottoNumbers;
import model.CreateUserNumbers;
import org.junit.jupiter.api.Test;
import repositroy.LottoSimulatorRepository;
import service.CheckLottoSimulatorService;

public class ModulTest {

  @Test
  public void  LottoCheck()throws Exception{
    //given
    LottoSimulatorRepository lottoSimulatorRepository = new LottoSimulatorRepository();
    CheckLottoSimulatorService checkLottoService = new CheckLottoSimulatorService();
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
      CreateLottoNumbers createLottosNumbers = new CreateLottoNumbers();
      //when
      createLottosNumbers.createLottos();
      //tnen
      createLottosNumbers.getLottos();
    }


}
