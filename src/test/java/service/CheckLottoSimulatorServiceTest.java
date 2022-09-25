package service;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckLottoSimulatorServiceTest {

  @Test
    public void 중복체크TEST(){
      //given
    CheckLottoSimulatorService checkLottoSimulatorService = new CheckLottoSimulatorService();
    List<Integer> users = Arrays.asList(1,2,3,4,5,6);
    List<Integer> lottos = Arrays.asList(1,2,3,4,5,7,8);
      //when
      checkLottoSimulatorService.setLottoCheckCount(lottos, users);
      //tnen
    Assertions.assertEquals(5, CheckLottoSimulatorService.lottoCheckCount);
    }
}