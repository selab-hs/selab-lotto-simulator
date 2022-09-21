package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import model.Number;
import org.jetbrains.annotations.NotNull;

public class InitView {
  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  private int orderNumber;

  public int startView() throws IOException {
    System.out.println("**** Selab Lotto Simulator ****");
    System.out.println("1. 시작");
    System.out.println("2. 종료");
    System.out.print("메뉴를 입력하시오> ");
    String init = bf.readLine();
    initValidation(init);
    return Integer.parseInt(init);
  }

  public void lottoMenu(int initOrder) throws IOException {
    if (initOrder == 1) {
      System.out.print("시뮬레이션 할 복권 수를 입력하시오> ");
      String loopNumber = bf.readLine();
      loopValidation(loopNumber);
      orderNumber = Integer.parseInt(loopNumber);
    }
    if(initOrder ==2){
      System.out.println("종료");
      System.exit(0);
    }
  }

  private void initValidation(@NotNull String init) throws IOException {
    if((!init.matches("^[0-9]*$"))){
      startView();
    };
  }

  private void loopValidation(String loopNumber) throws IOException {
    if(!loopNumber.matches("^[0-9]*$")){
      lottoMenu(Number.ONE);
    };
  }

  public int getOrderNumber() {
    return orderNumber;
  }
}