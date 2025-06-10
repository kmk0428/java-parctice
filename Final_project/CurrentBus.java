package Final_project;

public class CurrentBus {
    BusStop bus = new BusStop();
    CurrentTime time = new CurrentTime();

    private int[] todayList() {
        return bus.busStopTimeList();
    }

//    오늘 시간표 출력
    public void todayListPrint() {
        int week = time.today();

        for (int i = 0; i < todayList().length; i++) {

            if (week == 6 || week == 7) {
                System.out.println("오늘은 운행이 없습니다.");
                break;
            } else if ((week == 2 || week == 3 || week == 4) && (i == 8 || i == 11 || i == 13 || i == 15 || i == 17)) {
                System.out.printf("%02d) null\n", i);
                continue;
            }
            System.out.printf("%02d) %02d:%02d\n", i, todayList()[i] / 100, todayList()[i] % 100);
        }
    }

    public void currentBus() {
        int busSpeed = bus.busSpeed();


        for (int j : todayList()) {

            int busTime = j + busSpeed;

            if ((busTime % 100) >= 60) {
                busTime += 40;
            }

            if (busTime >= time.localTime()) {
                System.out.println("다음 버스 출발 시간은 " + j / 100 + ":" + j % 100 + "입니다.");
                System.out.println("현재 정거장 도착 예정 시간은 " + busTime / 100 + ":" + busTime % 100 + "입니다.");
                break;
            }
        }
    }
}
