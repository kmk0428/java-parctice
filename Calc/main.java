package Calc;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num1, num2, num3;

        System.out.print("더할 숫자를 입력: ");
        num1 = sc.nextInt();
        System.out.print("더할 숫자를 입력: ");
        num2 = sc.nextInt();
        System.out.print("더할 숫자를 입력: ");
        num3 = sc.nextInt();

        num = num1 + num2 + num3;
        System.out.println("모든 숫자의 합은 " + num + "입니다.");
    }
}
