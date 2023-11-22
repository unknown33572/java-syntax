package oop.thread;

public class BeepPrintExample02 {
  public static void main(String[] args) {
    Runnable beepTask = new BeepTask(); // Runnable 인터페이스를 구현한 클래스(BeepTask)의 인스턴스를 매개값으로 대입
    Thread thread = new Thread(beepTask);
    thread.start();

    for(int i = 0; i < 5; i++) {
      System.out.println("띵");
      try {
        Thread.sleep(500);
      } catch(Exception e) {}
    }
  }
}
