package oop.inoutstreamapi;

import java.io.*;

public class ch01 {
  public static void main(String[] args) throws IOException {
    InputStream is = System.in;
    Reader reader = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(reader);

    while(true) {
      System.out.println("입력하세요.");
      String lineString = br.readLine();
      if(lineString.equals("q") || lineString.equals("quit")) break;
      System.out.println("입력된 내용: " + lineString);
      System.out.println();
    }

    System.out.println("프로그램 종료");
    br.close(); // br을 닫으면 reader도 닫히고, reader를 닫으면 is도 닫힘
  }
}
