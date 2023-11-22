package oop.thread;

public class BeepPrintExample03 {
  public static void main(String[] args) {
    Thread thread = new BeepThread();
    thread.start(); // start() 메서드를 호출하면 BeepThread 내의 run() 메서드가 실행됨

    for(int i = 0; i < 5; i++) { // main 스레드가 실행하는 for문. main 스레드는 BeepThread와 동시에 실행되기 때문에 콘솔에 띵이 출력됨
      System.out.println("띵");
      try {
        Thread.sleep(500);
      } catch(Exception e) {}
    }
  }
}
