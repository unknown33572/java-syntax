package oop.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();

    set.add("Java");
    set.add("JDBC");
    set.add("Servlet/JSP");
    set.add("Java"); // 중복 저장이 안됨
    set.add("myBATIS");
    set.add("Spring");

    int size = set.size();
    System.out.println("총 객체수: " + size);

    Iterator<String> iterator = set.iterator(); // 반복자 얻기
    while(iterator.hasNext()) { // 객체 수만큼 루핑 .hasNext()는 다음에 읽어올 요소가 있으면 true, 없으면 false를 반환
      String element = iterator.next(); // hasNext()가 true를 반환하면 next()는 다음 요소를 읽어옴
      System.out.println("\t" + element);
    }

//    set.clear(); // 모든 객체를 제거하고 비움

    if(set.isEmpty()) {
      System.out.println("비어 있음");
    } else {
      System.out.println("비어 있지 않음");
    }
  }
}
