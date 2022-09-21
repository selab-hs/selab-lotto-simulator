package view;

import java.util.List;
import model.Number;

public class OutView {

  public static StringBuilder userNumberPrintBuilder = new StringBuilder();
  public static StringBuilder answerNumberPrintBuilder = new StringBuilder();
  public static StringBuilder rankNumberPrintBuilder = new StringBuilder();

  public void startResultView() {
    System.out.println("********* 자동 생성 번호 *********");
  }

  public void endResultView() {
    System.out.println("********************************");
  }

  private void rank(int lottoCheckNumber) {
    switch (lottoCheckNumber) {
      case 6:
        rankNumberPrintBuilder.append(" -> 1 등");
        break;
      case 5:
        rankNumberPrintBuilder.append(" -> 2 등");
        break;
      case 4:
        rankNumberPrintBuilder.append(" -> 3 등");
        break;
      case 3:
        rankNumberPrintBuilder.append(" -> 4 등");
        break;
      case 2:
        rankNumberPrintBuilder.append(" -> 5 등");
        break;
      case 1:
      case 0:
        rankNumberPrintBuilder.append(" -> 낙첨");
        break;
    }
  }

  private void numbersView(List<Integer> initList) {
    for (Integer number : initList) {
      if (number < 10) {
        userNumberPrintBuilder
            .append(number)
            .append("   ");
      }
      if (number >=10) {
        userNumberPrintBuilder
            .append(number)
            .append("  ");
      }
    }
  }

  private void answerView(List<Integer> initList) {
    for (int i = 0; i < initList.size() - 1; i++) {
      if ((initList.get(i) < 10)) {
        answerNumberPrintBuilder
            .append(initList.get(i))
            .append("   ");
      }
      if ((initList.get(i)) >= 10) {
        answerNumberPrintBuilder
            .append(initList.get(i))
            .append("  ");
      }
    }
    answerNumberPrintBuilder.append("+ ")
        .append(
            initList.get(initList.size() - Number.ONE)
        ).append(" ");
  }


  public void answerNumberView(List<Integer> answer) {
    System.out.println("*********** 당첨 번호 ***********");
    answerView(answer);
    System.out.println(answerNumberPrintBuilder);
    answerNumberPrintBuilder.setLength(0);
    endResultView();
  }

  public void userNumberView(List<Integer> userNumbers){
    numbersView(userNumbers);
    System.out.print(userNumberPrintBuilder);
    userNumberPrintBuilder.setLength(0);
  }

  public void rankNumberView(int lottoCheckResult){
    rank(lottoCheckResult);
    System.out.println(rankNumberPrintBuilder);
    rankNumberPrintBuilder.setLength(0);
  }

  public void duplicatedCheckNumberView(List<Integer> userNumbers,int lottoCheckResult) {
    userNumberView(userNumbers);
    rankNumberView(lottoCheckResult);
  }
}