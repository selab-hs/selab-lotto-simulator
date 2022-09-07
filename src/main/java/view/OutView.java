package view;

import model.Number;
import java.util.List;
import model.Lotto;
import model.User;

public class OutView {
  public void answer(){
    System.out.println("*********** 당첨 번호 ***********");
  }


  public void startResultView(){
    System.out.println("********* 자동 생성 번호 *********");
  }

  public void endResultView(){
    System.out.println("*******************************");
  }

  public void rank(int lottoCheckNumber){
    switch (lottoCheckNumber){
      case 6:
        System.out.println(" -> 1 등") ;
        break;
      case 5:
        System.out.println(" -> 2 등") ;
        break;
      case 4:
        System.out.println(" -> 3 등") ;
        break;
      case 3:
        System.out.println(" -> 4 등") ;
        break;
      case 2:
        System.out.println(" -> 5 등") ;
        break;
      case 1:
      case 0:
        System.out.println(" -> 낙첨") ;
        break;
    }
  }

  public void numbersView(List<User> initList){
    for (User user : initList) {
      if(user.getUser()<10){
        System.out.print(user.getUser() + "  ");
      }
      if(user.getUser()>=10){
        System.out.print(user.getUser() + " ");
      }

    }
  }
  public void answerView(List<Lotto> initList){
    for(int i=0; i<initList.size()-1;i++){
      if(initList.get(i).getLotto()<10){
        System.out.print(initList.get(i).getLotto() + "  ");
      }
      if(initList.get(i).getLotto()>=10){
        System.out.print(initList.get(i).getLotto() + " ");
      }
    }
    System.out.println("+ "+initList.get(initList.size()- Number.ONE).getLotto() +" ");
  }
}
