package Final_project;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.busStopTimeList();

    }
    
    public int today() {
        // 현재 요일, 시간 정보 가져오기
        LocalDate today = LocalDate.now();

//        오늘 요일 및 현재 시각
        String weekString = today.getDayOfWeek().toString();
        int weekValue = today.getDayOfWeek().getValue();
//        test
        System.out.println(weekString + "(" + weekValue + ")");

        return weekValue;
        
    }

    public int currentTime() {
        LocalTime now = LocalTime.now();
        int hourValue = now.getHour(), minuteValue = now.getMinute();
        return hourValue;
    }

    public int currentLocation() {
        // 현재 위치
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("정문(0) 중문(1) 보건대학(2) 학생회관(3) 예술대학(4) 생활관(5)");
            System.out.print("현재 장소를 입력하세요: ");
            int location = sc.nextInt();

            if (location >= 0 && location <= 5) {
                return location;
            }
            else {
                System.out.println("잘못된 입력 입니다.");
            }
        }
    }

    public void busStop() {
        // 정거장 위치 정보
        
    }

    public void closer() {
        // 가까운 정보 지정
        
    }

    public void busStopTimeList() {
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
    }

    public int busSpeed() {
        Main main = new Main();
        int location = main.currentLocation();
//         버스 정거장간 이동 시간
//        정문(0) → 중문(1) → 보건대학(2) → 학생회관(3) → 예술대학(4) → 생활관(5)
//        정거장간 이동시간 3분 가정
        int[] busSpeedList = {3, 6, 9, 12, 15, 18};

        return busSpeedList[location];
    }
    
}
