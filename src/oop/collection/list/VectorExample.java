package oop.collection.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {
  public static void main(String[] args) {
    List<Board> list = new Vector<>();

    list.add(new Board("제목1", "내용1", "글쓴이1"));
    list.add(new Board("제목2", "내용2", "글쓴이2"));
    list.add(new Board("제목3", "내용3", "글쓴이3"));

    list.remove(1);

    for(int i = 0; i < list.size(); i++) {
      Board board = list.get(i);
      System.out.println(board.getTitle() + "\t" + board.getContent() + "\t" + board.getWriter());
    } // index 1인 제목2, 내용2, 글쓴이2 삭제해서 제목3, 내용3, 글쓴이3이 index 1로 밀림
  }
}

class Board {
  private String title;
  private String content;
  private String writer;

  public Board(String title, String content, String writer) {
    this.title = title;
    this.content = content;
    this.writer = writer;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }

  public String getWriter() {
    return writer;
  }
}
