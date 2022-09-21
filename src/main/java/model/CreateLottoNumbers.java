package model;

import java.util.ArrayList;
import java.util.Random;
import repositroy.LottoSimulatorRepository;

public class CreateLottoNumbers implements CreateNumbers {

  private final LottoSimulatorRepository lottoSimulatorRepository = new LottoSimulatorRepository();

  public void createLotto(){
    lottoSimulatorRepository.setLottoNumbers(
        new ArrayList<>(
            CreateNumbers.createNumbers(Number.LOTTO_MAX_LENGTH, new Random())
        )
    );
    CreateNumbers.clearNumbers();
  }
}