package model;

import java.util.ArrayList;
import java.util.List;

public class CreateUserNumbers extends CreateNumbers {

  @Override
  public List<Integer> getNumbers(int length) {
    return super.getNumbers(length);
  }

  public List<User> createUserNumbers(){
    List<User> userNumbers = new ArrayList<>();
    List<Integer> members = new ArrayList<>(getNumbers(Number.USER_MAX_LENGTH));
    for(int member:members){
      userNumbers.add(new User(member));
    }
    return userNumbers;
  }
}