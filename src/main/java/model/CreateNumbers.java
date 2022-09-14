package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface CreateNumbers {

  default List<Integer> createNumbers(int length, Random random) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(random.nextInt(Number.MAX_NUMBER));
    for (int i = 0; i < (length - Number.ONE); i++) {
      numbers.add(random.nextInt(Number.MAX_NUMBER));
      for (int j = 0; j < i; j++) {
        if (numbers.get(j).equals(numbers.get(i))) {
          i--;
          break;
        }
      }
    }
    return numbers;
  }
}