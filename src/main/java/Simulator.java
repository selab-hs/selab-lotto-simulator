public class Simulator {
    public Simulator() {
        int inputValue = Input.getSimulatorInput();
        AutoNumber autoNumber = new AutoNumber();
        RandomNumber randomNumber = new RandomNumber(inputValue);

    }
}
/*
시뮬레이션 할 복권 수를 입력하시오> 9
*********** 당첨 번호 ***********
1  5   23  36  39  45  + 12
********* 자동 생성 번호 *********
4  10  14  15  24  34  -> 낙첨
1  5   23  36  39  45  -> 1등
1  12  23  36  39  45  -> 2등
23 24  25  34  35  44  -> 낙첨
1  5   12  22  35  45  -> 5등
12 13  14  15  16  17  -> 낙첨
1  6   36  37  39  45  -> 4등
13 15  22  25  29  42  -> 낙첨
1  5   23  36  38  45  -> 3등
*******************************
* */