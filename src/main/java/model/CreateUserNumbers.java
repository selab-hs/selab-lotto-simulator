package model;

import domain.Number;
import java.util.ArrayList;
import java.util.List;
import service.CreateNumbersService;

public class CreateUserNumbers extends CreateNumbersService {
  List<User> users = new ArrayList<>();

  @Override
  public List<Integer> getNumbers(int length) {
    return super.getNumbers(length);
  }

  private void users(){
    List<Integer> members = new ArrayList<>(getNumbers(Number.USER_MAX_LENGTH));
    for(int member:members){
      users.add(new User(member));
    }
  }

  public void createUsers(){
    users();
  }

  public List<User> getUsers() {
    return users;
  }
}
