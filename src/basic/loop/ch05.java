package basic.loop;

public class ch05 {
  public static void main(String[] args) {
    for(int i = 0; i <= 10; i++) {
      if(i % 2 != 0) {
        continue;
      }
      System.out.println(i);
    }

    System.out.println();

    for(int i = 0; i < 100; i++) {
      System.out.println(i);
      if(i == 50) {
        break;
      }
    }
  }
}
