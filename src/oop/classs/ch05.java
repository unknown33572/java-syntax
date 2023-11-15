package oop.classs;

public class ch05 {
  public static void main(String[] args) {
//    Singleton s1 = new Singleton(); // error
    Singleton s2 = Singleton.getInstance();
    Singleton s3 = Singleton.getInstance();

    System.out.println(s2 == s3); // 같은 객체를 참조하고 있는 인스턴스이므로 true
  }
}
