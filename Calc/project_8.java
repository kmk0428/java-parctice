package Calc;
import java.util.Scanner;

public class project_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //변수 선언
        int a = 0;

        //변수 입력
        a = sc.nextInt();

        //조건
        if (a < 100 && a > 1) {
            System.out.println("1에서 100 사이의 값입니다.");
        }
        else {
            System.out.println("1에서 100 사이의 값이 아닙니다.");
        }
    }
}
