package basic.loop;

import java.util.Random;

public class ch04 {
  public static void main(String[] args) {
    int num = (int)(Math.random() * 6 + 1);
    do {
      num = (int)(Math.random() * 6 + 1);
      System.out.println(num);
    } while(num == 6); // num이 6이면 반복문을 실행해서 num을 출력하고, num이 6이 아니면 반복문을 빠져나옴
  }
}
