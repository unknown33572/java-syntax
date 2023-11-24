package oop.inoutstreamapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DummyList {
    private List<Dummy> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private int dno;

    public void showMenu() {
      while(true) {
        System.out.println("--------------------");
        System.out.println("1.등록 | 2.목록 | 3.삭제 | 0.종료");
        System.out.println("--------------------");

        System.out.print("선택: ");
        String selectNo = sc.nextLine();
        switch(selectNo) {
          case "1":
            insert();
            break;
          case "2":
            selectAll();
            break;
          case "3":
            delete();
            break;
          case "0":
            System.out.println("프로그램 종료");
            System.exit(0);
            break;
          default:
            System.out.println("잘못된 입력입니다.");
            break;
        }
      }
    }

    void insert() {
      System.out.println("등록");
      System.out.print("상품번호: ");
      dno = sc.nextInt();
      System.out.print("상품명: ");
      String dname = sc.nextLine();
      System.out.print("가격: ");
      int price = sc.nextInt();
      System.out.print("재고: ");
      int stock = sc.nextInt();
      sc.nextLine();

      Dummy dummy = new Dummy();
      dummy.setDno(dno);
      dummy.setDname(dname);
      dummy.setPrice(price);
      dummy.setStock(stock);

      list.add(dummy);
    }

    void selectAll() {
      System.out.println("목록");
      for(Dummy dummy : list) {
        System.out.println(dummy.getDno() + " | " + dummy.getDname() + " | " + dummy.getPrice() + " | " + dummy.getStock());
      }
    }

    void delete() {
      System.out.println("삭제할 상품번호를 입력하세요: ");
      int dno = sc.nextInt();
      sc.nextLine();
//      for(Dummy dummy : list) {
//        if(dummy.getDno() == dno) {
//          list.remove(dummy);
//          System.out.println(dno + "번 상품이 삭제되었습니다.");
//        } else {
//          System.out.println("상품번호가 존재하지 않습니다.");
//        }
//      }
      Iterator<Dummy> iterator = list.iterator();
      boolean flag = false;
      while(iterator.hasNext()) { // iterator.hasNext()는 다음에 읽어올 요소가 있으면 true, 없으면 false를 반환
        Dummy dummy = iterator.next(); // iterator.next()는 Dummy 객체를 반환
        if(dummy.getDno() == dno) {
          iterator.remove();
          flag = true; // 삭제 성공하면 플래그 true로 변경
          break; // 삭제 성공하면 반복문 종료
        }
      }
      if(flag) { // 플래그가 true면 삭제 성공 계속 false면 삭제 실패
        System.out.println(dno + "번 상품이 삭제되었습니다.");
      } else {
        System.out.println("상품번호가 존재하지 않습니다.");
      }
    }
}
