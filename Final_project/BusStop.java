package Final_project;
import java.util.Scanner;

public class BusStop {
    private final int[] busTimeListInt = {810, 820, 830, 840, 840, 850, 900, 910, 920, 930, 940, 950, 1000, 1010, 1030, 1050, 1110, 1120, 1140, 1220, 1250, 1300, 1320, 1340, 1420, 1440, 1520, 1540, 1620, 1640, 1720, 1740};
    private int location = 0;
    private int direction = 0;

//    오늘 버스 시간표
    public int[] todayTimeList() {

        int[] busTime = busTimeListInt;
        int speed = busSpeed();

        for (int i = 0; i < busTime.length; i++) {

            busTime[i] += speed;

            if ((busTime[i] % 100) >= 60) {
                busTime[i] += 40;
            }
        }
        return busTime;
    }

//    현재 장소 밑 진행 방향
    public void location(int cas) {
        Scanner sc = new Scanner(System.in);
        switch (cas) {
            case 1:
                location = sc.nextInt() - 1;
                System.out.println();
                break;

            case 2:
                direction = sc.nextInt() - 1;
                System.out.println();
                break;

        }
//        test
//        location = 3;
    }

//  정거장 위치
    public void currentLocation() {
        String[] busStop = {"정문", "중문", "보건대학", "학생회관", "예술대학", "생활관"};

        while (true) {
            System.out.println("(1)정문 (2)중문 (3)보건대학 (4)학생회관 (5)예술대학 (6)생활관");
            System.out.print("현재 장소를 입력하세요: ");
            location(1);

            if (location < 0 || location > 5) {
                System.out.println("잘못된 입력 입니다.\n");
                continue;
            }

            System.out.println("현재 정거장은 " + busStop[location] + "입니다.\n");
            break;



        }
        if (location != 0 && location != 5) {
            while (true) {

                System.out.print(busStop[location] + " -> " + busStop[location + 1] + "(1)\n" + busStop[location] + " -> " + busStop[location - 1] + "(2)\n진행 방향을 선택해 주세요: ");
                location(2);

                if (direction < 0 || direction > 1) {
                    System.out.println("잘못된 입력 입니다.\n");
                    continue;
                }
                break;
            }
        }

    }

//    버스 정거장간 이동 시간
    public int busSpeed() {

        if (direction != 0) {
            location += 5;
        }
//        정거장간 이동시간 3분 가정
//        정문(0) → 중문(1) → 보건대학(2) → 학생회관(3) → 예술대학(4) → 생활관(5) → 예술대학(9) → 학생회관(8) → 보건대학(7) → 중문(6) → 정문(0)
        int[] busSpeedList = {0, 3, 6, 9, 12, 15, 27, 24, 21, 18};

        return busSpeedList[location];
    }
}
