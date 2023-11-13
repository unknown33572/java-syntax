package basic.reference;

import java.util.Calendar;

public class ch05 {
  public static void main(String[] args) {
    Week today = null;

    Calendar calendar = Calendar.getInstance(); // 캘린더 객체의 인스턴스 생성
    int week = calendar.get(Calendar.DAY_OF_WEEK); // 현재 요일을 구하는 메서드

    switch(week) {
      case 1:
        today = Week.SUNDAY;
        break;
      case 2:
        today = Week.MONDAY;
        break;
      case 3:
        today = Week.TUESDAY;
        break;
      case 4:
        today = Week.WEDNESDAY;
        break;
      case 5:
        today = Week.THURSDAY;
        break;
      case 6:
        today = Week.FRIDAY;
        break;
      case 7:
        today = Week.SATURDAY;
        break;
    }
    System.out.println("오늘 요일: " + today);

    if(today == Week.SUNDAY) {
      System.out.println("일요일이니까 쉬자.");
    } else {
      System.out.println("평일이니까 공부해야지.");
    }
  }
}
