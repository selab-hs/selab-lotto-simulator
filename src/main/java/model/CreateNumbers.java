package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class CreateNumbers {

  Random random = new Random();

  private List<Integer> createNumbers(int length){
    List<Integer> numbers = new ArrayList<>();
    numbers.add(random.nextInt(Number.MAX_NUMBER));
    for(int i=0; i<(length-Number.ONE);i++){
      numbers.add(random.nextInt(Number.MAX_NUMBER));
      for(int j =0; j<i;j++){
        if(numbers.get(j).equals(numbers.get(i))){
          i--;
          break;
        }
      }
    }
    return numbers;
  }

  public List<Integer> getNumbers(int length){
    return createNumbers(length);
  }
}