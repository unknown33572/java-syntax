package oop.abstractt;

public class SmartPhone extends Phone {
  public SmartPhone(String owner, String brand) {
    super(owner, brand);
  }

  public void internetSearch() {
    System.out.println(owner + "이(가) 인터넷 검색을 합니다.");
  }

}
