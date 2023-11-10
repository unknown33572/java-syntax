package basic.loop;

public class ch02 {
  public static void main(String[] args) {
    boolean run = true;
    int i = 0;
    while(run) {
      i++;
      System.out.println(i);
      if(i >= 5) {
        System.out.println("loop end");
        run = false;
      }
    }
  }
}
