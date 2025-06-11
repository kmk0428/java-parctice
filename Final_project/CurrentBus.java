package Final_project;

public class CurrentBus {
    BusStop bus = new BusStop();
    CurrentTime time = new CurrentTime();

    private int[] todayList() {
        return bus.todayTimeList();
    }

//    오늘 시간표 출력
    public void todayListPrint() {
        bus.currentLocation();
        int week = time.today();
        int[] timeList = todayList();

        for (int i = 0; i < timeList.length; i++) {

            if ((week == 2 || week == 3 || week == 4) && (i == 8 || i == 11 || i == 13 || i == 15 || i == 17)) {
                System.out.printf("%02d) null\n", i);
                continue;
            } else if (week == 6 || week == 7) {
                    System.out.println("오늘은 운행이 없습니다.");
                    break;
            }
            System.out.printf("%02d) %02d:%02d\n", i, timeList[i] / 100, timeList[i] % 100);
        }
    }

    public void currentBus() {
        bus.currentLocation();
        int[] timeList = todayList();


        for (int i = 0; i < timeList.length; i++) {

            if (timeList[i] >= time.localTime()) {
                System.out.println("현재 출발 예정 시간은 " + timeList[i] / 100 + ":" + timeList[i] % 100 + "입니다.");
                System.out.println("다음 출발 예정 시간은 " + timeList[i + 1] / 100 + ":" + timeList[i + 1] % 100 + "입니다.");
                break;
            }
        }
    }
}
