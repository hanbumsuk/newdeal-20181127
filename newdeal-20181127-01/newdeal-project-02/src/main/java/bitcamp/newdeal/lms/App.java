package bitcamp.newdeal.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 스캐너는 어디에서 읽어야 하는지 모르므로,
    // 생성자에 알려줘야 하므로,
    // 어시스턴스 뷰를 지정해 줘야 한다.
    // 키보드에서 읽어 와야 하는데,
    // system이라는 변수에 in이라는 인스턴스를 지정 해준다.
    System.out.println("번호?");
    int num = Integer.parseInt(sc.nextLine()); // nextLine 다음 것을 가져와라
    // 키보드에서 입력한 문자열을 리턴
    // valueOf = 파라미터로 문자열을 받았을 때, 날짜정보가 들어있는 date 객체를 생성한다.

    System.out.println("수업명?");
    String title = sc.nextLine();

    System.out.println("내용??");
    String content = sc.nextLine();
 
    System.out.println("강의 시작일?");
    Date startdate = Date.valueOf(sc.nextLine());

    System.out.println("강의 마지막??");
    Date enddate = Date.valueOf(sc.nextLine());

    System.out.println("총 강의 시간");
    int totalHours = Integer.parseInt(sc.nextLine());

    System.out.println("일 강의 시간");
    int dayHours = Integer.parseInt(sc.nextLine());

    sc.close();

    System.out.println("번호" + num);
    System.out.printf("수업명 : %s \n ", title); // 역슬러시로 문자열 안에 삽입하는 명령어를 이스케이프라고 한다.
    System.out.println("내용 : %s \n" + content);
    System.out.printf("시작일 : %s \n", startdate);
    System.out.println("마지막: %s \n" + enddate);
    System.out.printf(" 총 강의 시간 : %d \n ", totalHours);
    System.out.println("일 강의 시간 : %d \n" + dayHours);
  }
}
