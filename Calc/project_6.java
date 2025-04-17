package Calc;
import java.util.Scanner;

public class project_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //변수 선언
        int bus = 0;

        //입력
        System.out.print("지금온 버스는 몇번 버스인가: ");
        bus = sc.nextInt();
        System.out.print(bus + "번 버스다.\n");

        //조건문
        System.out.print("내가 기다리는 버스가 맞는가?\n");
        if (bus == 101) {
            System.out.print("내가 기다리던 버스다.\n버스에 탄다.");
        }
        else {
            System.out.print("내가 기다리던 버스가 아니다.\n버스에 타지 않는다.");
        }

    }
}
