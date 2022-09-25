package model;

import java.util.ArrayList;
import java.util.Random;
import repositroy.LottoSimulatorRepository;

public class CreateUserNumbers implements CreateNumbers {

  private final LottoSimulatorRepository lottoSimulatorRepository = new LottoSimulatorRepository();

  public void createUserNumbers(){
    lottoSimulatorRepository.setUserNumbers(
        new ArrayList<>(
            CreateNumbers
                .createNumbers(Number.USER_MAX_LENGTH, new Random())
        )
    );
    CreateNumbers.clearNumbers();
  }
}