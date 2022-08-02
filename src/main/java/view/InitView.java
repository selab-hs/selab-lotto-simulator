package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InitView {
  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  int option;

  public int startView() throws IOException {

    System.out.println("**** Selab Lotto Simulator ****");
    System.out.println("1. 시작");
    System.out.println("2. 종료");
    System.out.print("메뉴를 입력하시오> ");
    return Integer.parseInt(bf.readLine());
  }

  public void lottoMenu(int initOrder) throws IOException {
    if (initOrder == 1) {
      System.out.print("시뮬레이션 할 복권 수를 입력하시오> ");
      option = Integer.parseInt(bf.readLine());
    }
  }

  public int getOption() {
    return option;
  }
}