package bitcamp.newdeal.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    final int DEFAULT_SIZE = 20;

    int[] no = new int[DEFAULT_SIZE]; // new int에서는 4바이트 메모리를 size개로 만든다는 소리 이다.
    // 힙메모리에 남아있는 메모리 중에서 jvm에서 사용 할 메모리를 할당 해 준다.
    // 기본적으로 자바는 3개로 나눈다.
    // 인스턴스 객체를 나누는 힙 메모리와
    // 클래스 자체를 나누는 메소드 에어리어와
    // 로컬변수를 만드는 스택이라는 메모리

    // 쓰레드를 하나 더 만든다고 치면,
    // 스텍은 하나 더 추가 된다.

    // int[]no는 로컬 변수이고, 이것을 레퍼런스라고 하고, c언어에서는 포인터라고 한다.
    // 배열도 주소 변수에 해당된다.

    String[] title = new String[DEFAULT_SIZE];
    String[] contens = new String[DEFAULT_SIZE];
    Date[] startDate = new Date[DEFAULT_SIZE];
    Date[] endDate = new Date[DEFAULT_SIZE];
    int[] totalHours = new int[DEFAULT_SIZE];
    int[] dayHours = new int[DEFAULT_SIZE];

    int len = 0;

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < no.length; i++) {

      System.out.println("번호?");
      no[i] = Integer.parseInt(sc.nextLine());

      System.out.println("수업명?");
      title[i] = sc.nextLine();

      System.out.println("내용??");
      contens[i] = sc.nextLine();

      System.out.println("강의 시작일?");
      Date startdate = Date.valueOf(sc.nextLine());

      System.out.println("강의 마지막??");
      Date enddate = Date.valueOf(sc.nextLine());

      System.out.println("총 강의 시간");
      totalHours[i] = Integer.parseInt(sc.nextLine());

      System.out.println("일 강의 시간");
      dayHours[i] = Integer.parseInt(sc.nextLine());

      len++;

      System.out.println("계속 하시겠습니까?(Y/n)"); // 대문자 Y의 의미는 엔터를 치면 y라고 알아 듣겠다는 뜻이다.
      String input = sc.nextLine();
      if (input.equals("") || input.equals("y")) {
        continue;
      }
      break;
    }
    sc.close();

    for (int i = 0; i < len; i++) {

      System.out.printf("%d, %s, %s ~ %s, %d\n", no[i], title[i], contens[i], startDate[i],
          endDate[i], totalHours[i], dayHours[i]);

    }
  }
}
