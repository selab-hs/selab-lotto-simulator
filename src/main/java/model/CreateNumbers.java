package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public interface CreateNumbers {

  List<Integer> numbers = new ArrayList<>();

  static List<Integer> createNumbers(int length, Random random) {
    numbers.add(random.nextInt(Number.MAX_NUMBER)+1);
    List<Integer> duplicatedNumbers;
    do {
      numbers.add(random.nextInt(Number.MAX_NUMBER));
      duplicatedNumbers = new ArrayList<>(
          numbers.stream()
          .distinct()
          .collect(Collectors.toList())
      );
      numbers.clear();
      numbers.addAll(duplicatedNumbers);
      duplicatedNumbers.clear();
    }while(numbers.size()<length);
    Collections.sort(numbers);
    return numbers;
  }

  static void clearNumbers(){
    numbers.clear();
  }
}