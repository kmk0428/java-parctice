package Final_project;
import java.util.Scanner;

public class BusStop {
    private final int[] busTimeListInt = {810, 820, 830, 840, 840, 850, 900, 910, 920, 930, 940, 950, 1000, 1010, 1030, 1050, 1110, 1120, 1140, 1220, 1250, 1300, 1320, 1340, 1420, 1440, 1520, 1540, 1620, 1640, 1720, 1740};

//  정거장 위치
    public int currentLocation() {
        Scanner sc = new Scanner(System.in);
        String[] busStop = {"정문", "중문", "보건대학", "학생회관", "예술대학", "생활관"};

        while (true) {
            System.out.println("정문(0) 중문(1) 보건대학(2) 학생회관(3) 예술대학(4) 생활관(5)");
            System.out.print("현재 장소를 입력하세요: ");
            int location = sc.nextInt();

            if (location >= 0 && location <= 5) {
                System.out.println("현재 정거장은 " + busStop[location] + "입니다.\n");
                return location;
            }
            else {
                System.out.println("잘못된 입력 입니다.");
            }
        }
    }
    public void busStopTimeList() {
        for (int j : busTimeListInt) {
            System.out.println(j / 100 + ":" + j % 100);
        }
    }
}
