package Final_project;
import java.util.Scanner;

public class BusStop {
    private final int[] busTimeListInt = {810, 820, 830, 840, 840, 850, 900, 910, 920, 930, 940, 950, 1000, 1010, 1030, 1050, 1110, 1120, 1140, 1220, 1250, 1300, 1320, 1340, 1420, 1440, 1520, 1540, 1620, 1640, 1720, 1740};
    private int location;

    public int[] busStopTimeList() {
        return busTimeListInt;
    }

//    현재 장소
    public void location() {
        Scanner sc = new Scanner(System.in);
        location = sc.nextInt() - 1;
//        test
//        location = 3;
    }

//  정거장 위치
    public void currentLocation() {
        String[] busStop = {"정문", "중문", "보건대학", "학생회관", "예술대학", "생활관"};

        while (true) {
            System.out.println("정문(1) 중문(2) 보건대학(3) 학생회관(4) 예술대학(5) 생활관(6)");
            System.out.print("현재 장소를 입력하세요: ");
            location();
            if (location >= 1 && location <= 6) {
                System.out.println("현재 정거장은 " + busStop[location] + "입니다.\n");
                break;
            }
            else {
                System.out.println("잘못된 입력 입니다.");
            }
        }
    }
//    기본 시간표 출력
    public void busStopTimeListPrint() {
        for (int j : busTimeListInt) {
            System.out.println(j / 100 + ":" + j % 100);
        }
    }
//    버스 정거장간 이동 시간
    public int busSpeed() {

//        정문(0) → 중문(1) → 보건대학(2) → 학생회관(3) → 예술대학(4) → 생활관(5)
//        정거장간 이동시간 3분 가정
        int[] busSpeedList = {0, 3, 6, 9, 12, 15, 18};

        return busSpeedList[location];
    }
}
