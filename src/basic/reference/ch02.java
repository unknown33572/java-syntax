package basic.reference;

public class ch02 {
  public static void main(String[] args) {
    int[] arr1 = new int[5];
    int[] arr2 = {1, 2, 3, 4, 5};
    String arr3[] = new String[5];
    arr3[0] = "가";
    arr3[1] = "나";
    arr3[2] = "다";
    arr3[3] = "라";
    arr3[4] = "마";

    System.out.println(arr1.length);
    for(int i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i]); // 값을 지정하지 않았기 때문에 0이 출력됨
    }

    System.out.println(arr2.length);
    for(int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]); // 값을 지정했기 때문에 1, 2, 3, 4, 5가 출력됨
    }

    System.out.println(arr3.length);
    for(int i = 0; i < arr3.length; i++) {
      System.out.println(arr3[i]); // 값을 지정했기 때문에 가, 나, 다, 라, 마가 출력됨
    }
  }
}
