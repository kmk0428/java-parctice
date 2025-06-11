package Final_project;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrentBus now = new CurrentBus();

        int manual;

        while (true) {
            System.out.print("(1)오늘 버스 시간표 (2)버스 도착 예상시간\n원하시는 메뉴를 선택해 주세요: ");
            manual = sc.nextInt();
            System.out.println();
            if (manual <= 2 && manual >= 1) {
                break;
            }
            else {
                System.out.println("잘못된 입력입니다.\n");
            }
        }
//        int manual = 2;

        switch (manual) {
            case 1:
                now.todayListPrint();
                break;
            case 2:
                now.currentBus();
                break;
        }
    }
}
