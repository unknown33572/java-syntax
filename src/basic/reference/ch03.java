package basic.reference;

public class ch03 {
  public static void main(String[] args) {
    int[] scores;
    scores = new int[] {70, 80, 90};
    int sum1 = 0;
    for(int i = 0; i < 3; i++) {
      sum1 += scores[i];
    }
    System.out.println("총합: " + sum1);

    int sum2 = add(new int[] {50, 60, 70});
    System.out.println("총합: " + sum2);
  }

  public static int add(int[] scores) { // 배열을 매개변수로 받음
    int sum = 0;
    for(int result : scores) {
      sum += result;
    }
    return sum;
  }
}
