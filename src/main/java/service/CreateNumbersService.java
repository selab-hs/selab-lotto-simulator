package service;

import domain.Number;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public abstract class CreateNumbersService {

  Random random = new Random();

  private int createNumber(){
    return  random.nextInt(Number.MAX_NUMBER);
  }

  private List<Integer> createNumbers(int length){
    List<Integer> numbers = new ArrayList<>();
    numbers.add(createNumber());
    for(int i=0; i<(length-Number.ONE);i++){
      numbers.add(createNumber());
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
