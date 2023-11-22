package oop.thread;

import java.awt.*;

public class BeepPrintExample04 {
  public static void main(String[] args) {
    Thread thread = new Thread() { // Thread에서 익명객체로 run() 메서드를 재정의
      @Override
      public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 5; i++) {
          toolkit.beep();
          try {
            Thread.sleep(500);
          } catch(Exception e) {}
        }
      }
    }; // 익명객체는 세미콜론으로 끝남
    thread.start();

    for(int i = 0; i < 5; i++) {
      System.out.println("띵");
      try {
        Thread.sleep(500);
      } catch(Exception e) {}
    }
  }
}
