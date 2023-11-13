package oop.classs;

public class ch01 {
  public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println("s1 변수가 Student 객체를 참조합니다.");

    Student s2 = new Student();
    System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");

    s1.studentName = "홍길동";
    s1.studentNumber = 1004;

    s2.studentName = "김유신";
    s2.studentNumber = 1003;

    System.out.println("s1 학생의 이름은 " + s1.studentName + "이고, 학번은 " + s1.studentNumber + "입니다.");
    System.out.println("s2 학생의 이름은 " + s2.studentName + "이고, 학번은 " + s2.studentNumber + "입니다.");

    System.out.println(s1 == s2); // false (각각 다른 객체를 참조하고 있기 때문에)

    s1.study();
    s2.study();

    s1.major("컴퓨터공학과");
    s2.major("전자공학과");
  }
}

class Student {
  int studentNumber; // field
  String studentName;
  String majorName;
  int grade;

  public Student() {} // default constructor

  public Student(int studentNumber, String studentName) { // constructor overloading
    this.studentNumber = studentNumber; // this: 자기 자신의 객체를 가리키는 참조 변수
    this.studentName = studentName;
  }

  public void study() { // void type method
    System.out.println(studentName + "이(가) 공부합니다.");
  }

  public String major(String major) { // return type method
    this.majorName = major;
    System.out.println(studentName + "의 전공은 " + majorName + "입니다.");
    return majorName; // return value
  }
}
