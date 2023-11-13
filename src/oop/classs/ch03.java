package oop.classs;

public class ch03 {
  static int plus(int x, int y) {
    return x + y;
  }

  static int plus(int x, int y, int z) { // overloading
    return x + y + z;
  }

  static int morePlus(int x, int y, double z) {
    return (int) (plus(x, y) + z); // method call 후에 casting
  }

  public static void main(String[] args) {
    System.out.println(plus(1, 2));
    System.out.println(plus(1, 2, 3));
    System.out.println(morePlus(1, 2, 4.5)); // .5는 int타입으로 변환 돼서 버림
  }
}
