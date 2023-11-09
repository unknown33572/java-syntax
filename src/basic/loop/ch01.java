package basic.loop;

public class ch01 {
  public static void main(String[] args) {
    int[] ball = new int[6]; // 6개의 정수값을 저장하기 위한 배열 생성
    for(int i = 0; i <= 5; i++) {
      int lotto = (int)(Math.random() * 45) + 2; // 2 ~ 45 사이의 임의의 정수를 lotto 변수에 저장
      for(int j = 0; j <= i; j++) {
        if(ball[j] == lotto) { // ball 배열에 저장된 값과 lotto 변수에 저장된 값이 같은지 비교
          ball[i] = lotto--; // 같은 값이 있을 경우 i를 1 감소시켜서 다시 반복문을 실행
          break; // 반복문을 빠져나옴
        }
      }
      ball[i] = lotto; // lotto 변수에 저장된 값을 ball 배열에 저장
      System.out.println(ball[i]);
    }
  }
}
