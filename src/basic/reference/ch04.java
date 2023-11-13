package basic.reference;

public class ch04 {
  public static void main(String[] args) {
    int[][] scores = {
      {70, 80, 90}, // 1행의 배열
      {50, 60, 70} // 2행의 배열
    };

    int score1 = scores[0][0] + scores[0][1] + scores[0][2]; // 1행의 총합
    int score2 = scores[1][0] + scores[1][1] + scores[1][2]; // 2행의 총합

    System.out.println("총합: " + score1);
    System.out.println("총합: " + score2);
  }

  // 3차원 배열은 생략
}
