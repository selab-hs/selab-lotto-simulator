package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateUserNumbers implements CreateNumbers {

  public List<User> createUserNumbers(){
    List<User> userNumbers = new ArrayList<>();
    List<Integer> members = new ArrayList<>(createNumbers(Number.USER_MAX_LENGTH, new Random()));
    for(int member:members){
      userNumbers.add(new User(member));
    }
    return userNumbers;
  }
}