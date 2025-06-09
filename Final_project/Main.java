package Final_project;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BusStop bus = new BusStop();
        CurrentBus now = new CurrentBus();

        System.out.print("현재 정거장(1) 오늘 시간표(2) 버스 시간표(3)\n원하시는 메뉴를 선택해 주세요: ");

        int manual = sc.nextInt();
//        int manual = 2;

        switch (manual) {
            case 1:
                bus.currentLocation();
                now.currentBus();
                break;
            case 2:
                now.todayListPrint();
                break;
            case 3:
                bus.busStopTimeListPrint();
                break;
        }
    }



//    public void busStop() {
//        // 정거장 위치 정보
//
//    }
}
