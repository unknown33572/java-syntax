package basic.variable;

public class ch02 { // class scope
  public static void main(String[] args) { // method scope
    int x = 10; // local variable
    int y = 20;
    int z = x + y;

    System.out.println(z);

    System.out.println(x+y);

    if(x < 30) { // block scope
      int i;
      i = x + y;

      int j = x + y;
      System.out.println(j); // 변수 j는 block scope 선언 했기 때문에 if문 블록 안에서만 사용 가능
    }

    //System.out.println(i); // 변수 i는 block scope 선언 했기 때문에 안에서 컴파일 에러 발생
  }
}
