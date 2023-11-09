package basic.condition;

public class ch01 {
  public static void main(String[] args) {
    int score = (int)(Math.random() * 100); // 0 ~ 99 사이의 임의의 정수를 score 변수에 저장

    System.out.println(score);

    if(score >= 90) {
      System.out.println("A");
    } else if(score >= 80) {
      System.out.println("B");
    } else if(score >= 70) {
      System.out.println("C");
    } else if(score >= 60) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }
  }
}
