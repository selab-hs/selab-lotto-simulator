package model;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import repositroy.LottoSimulatorRepository;

class CreateLottoNumbersTest {
  @Test
    public void 로토숫자_생성Test(){

      CreateLottoNumbers createLottoNumbers = new CreateLottoNumbers();
      LottoSimulatorRepository repository = new LottoSimulatorRepository();

      for(int i=0; i<10;i++){
        createLottoNumbers.createLotto();
        List<Integer> lottos = new ArrayList<>(repository.getLottoNumbers());
        System.out.println(lottos);
        repository.clearLottoNumber();
      }
    }

}