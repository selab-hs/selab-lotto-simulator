package model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public interface CreateNumbers {

  Set<Integer> numbers = new HashSet<>();

  static Set<Integer> createNumbers(int length, Random random) {
    do {
      numbers.add(random.nextInt(Number.MAX_NUMBER));
    } while (numbers.size() < length);

    return numbers;
  }

  static void clearNumbers() {
    numbers.clear();
  }
}