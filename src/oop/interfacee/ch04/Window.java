package oop.interfacee.ch04;

public class Window {
  Button button1 = new Button();
  Button button2 = new Button();

  Button.OnClickListener listener = new Button.OnClickListener() {
    @Override
    public void onClick() {
      System.out.println("전화를 겁니다.");
    }
  };

  Window() {
    button1.setOnClickListener(listener);
    button2.setOnClickListener(new Button.OnClickListener() {
      @Override
      public void onClick() { // 익명 객체 오버라이드
        System.out.println("메시지를 보냅니다.");
      }
    });
  }
}
