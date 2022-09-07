package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreateLottoNumbersTest {

  @Test
  void createLotto() {
    CreateLottoNumbers createLottoNumbers = new CreateLottoNumbers();
    assertEquals(7,createLottoNumbers.createLotto().size());
  }
}