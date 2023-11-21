package oop.interfacee.ch04;

public class Button {
  OnClickListener listener;

  void setOnClickListener(OnClickListener listener) {
    this.listener = listener;
  }

  void touch() {
    listener.onClick();
  }

  static interface OnClickListener { // 중첩 인터페이스
    void onClick();
  }
}
