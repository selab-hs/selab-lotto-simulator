import model.CreateUserNumbers;
import org.junit.jupiter.api.Test;
import repositroy.LottoSimulatorRepository;

public class ModulTest {
@Test
  public void testMethod() throws Exception{
    //given
    CreateUserNumbers createUserNumbers = new CreateUserNumbers();
    LottoSimulatorRepository lottoSimulatorRepository = new LottoSimulatorRepository();
    //when
    for(int i=0;i<100;i++){
      createUserNumbers.createUserNumbers();
      System.out.println(lottoSimulatorRepository.getUserNumbers());
      lottoSimulatorRepository.clearUserNumber();
    }
    //tnen
  }
}

