package Final_project;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        BusStop bus = new BusStop();
        Scanner sc = new Scanner(System.in);

        System.out.print("버스 시간표(1) 현재 정거장(2)\n원하시는 메뉴를 선택해 주세요: ");

        int manual = sc.nextInt();

        switch (manual) {
            case 1:
                bus.currentLocation();
                break;
            case 2:
                bus.busStopTimeList();
        }

    }
    
    public int today() {
        // 현재 요일, 시간 정보 가져오기
        LocalDate today = LocalDate.now();

//        오늘 요일
        String weekString = today.getDayOfWeek().toString();
        int weekValue = today.getDayOfWeek().getValue();
//        test
        System.out.println(weekString + "(" + weekValue + ")");

        return weekValue;
        
    }

    public int currentTime() {
//        현재 시간
        LocalTime now = LocalTime.now();
        return now.getHour() * 100 + now.getMinute();
    }


    public void busStop() {
        // 정거장 위치 정보
        
    }


    public String[] busStopTimeList() {
//         버스 정거장 시간표
        Main main = new Main();
        String[] busTimeList = {"8:10", "8:20", "8:30", "8:40", "8:50", "9:00", "9:10", "9:20", "9:30", "9:40", "9:50", "10:00", "10:10", "10:30", "10:50", "11:10", "11:20", "11:40", "12:20", "12:50", "13:00", "13:20", "13:40", "14:20", "14:40", "15:20", "15:40", "16:20", "16:40", "17:20", "17:40"};


        int week = main.today();
//        int week = 3;



//            test
        for (int i = 0; i < busTimeList.length; i++) {

            if (week == 6 || week == 7) {
                System.out.println("오늘은 운행이 없습니다.");
                break;
            } else if ((week == 2 || week == 3 || week == 4) && (i == 8 || i == 11 || i == 13 || i == 15 || i == 17)) {
                System.out.println("null");
                continue;
            }
            System.out.println(i + ") " + busTimeList[i]);
        }
        return busTimeList;
    }

    public int busSpeed() {
        Main main = new Main();

//        int location = main.currentLocation();
        int location = 3;
//        버스 정거장간 이동 시간
//        정문(0) → 중문(1) → 보건대학(2) → 학생회관(3) → 예술대학(4) → 생활관(5)
//        정거장간 이동시간 3분 가정
        int[] busSpeedList = {0, 3, 6, 9, 12, 15, 18};

        return busSpeedList[location];
    }

    public void nextTime() {
//        현재 정거장 다음 버스 시간
        Main main = new Main();
        String[] busTimeList = main.busStopTimeList();
        int busSpeed = main.busSpeed();
        int[] busTimeListInt = {810, 820, 830, 840, 840, 850, 900, 910, 920, 930, 940, 950, 1000, 1010, 1030, 1050, 1110, 1120, 1140, 1220, 1250, 1300, 1320, 1340, 1420, 1440, 1520, 1540, 1620, 1640, 1720, 1740};
        for (int i = 0; i < busTimeListInt.length; i++) {

            int busTime = busTimeListInt[i] + busSpeed;

            if ((busTime % 100) >= 60) {
                busTime += 40;
            }

            if (busTime >= main.currentTime()) {
                System.out.println("다음 버스 출발 시간은 " + busTimeList[i] + "입니다.");
                System.out.println("현재 정거장 도착 예정 시간은 " + busTime / 100 + ":" + busTime % 100 + "입니다.");
                break;
            }
        }
    }
}
