package Final_project;
import java.time.LocalDate;
import java.time.LocalTime;


public class currentTime {
//    현재 시간
    public int localTime(){
        LocalTime now = LocalTime.now();
        return now.getHour() * 100 + now.getMinute();
    }

//    요일
    public int today() {
        LocalDate today = LocalDate.now();

        String weekString = today.getDayOfWeek().toString();
        int weekValue = today.getDayOfWeek().getValue();

        System.out.println(weekString + "(" + weekValue + ")");

        return weekValue;
    }
}
