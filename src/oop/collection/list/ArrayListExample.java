package oop.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(); // List<String> list = new ArrayList<String>();

    list.add("Java");
    list.add("C++");
    list.add(1, "Python"); // index 1에 Python 추가 그래서 C++는 index 2로 밀림
    list.add("JavaScript");

    int size = list.size();
    System.out.println("list Size: " + size);

    System.out.println();

    for(String str : list) {
      System.out.println(str);
    }

    System.out.println();

    list.remove(2); // index 1인 C++ 삭제

    for(int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
