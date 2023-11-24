package oop.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    map.put("루피", 1);
    map.put("뽀로로", 2);
    map.put("콩순이", 1);
    map.put("크롱", 3);
    map.put("루피", 4);
    System.out.println(map.size());

    System.out.println(map.get("루피")); // 마지막 값인 4가 출력됨

    Set<String> keySet = map.keySet();
    Iterator<String> keyIterator = keySet.iterator();
    while(keyIterator.hasNext()) {
      String key = keyIterator.next();
      Integer value = map.get(key);
      System.out.println("\t" + key + ": " + value);
    }
    System.out.println();
  }
}
