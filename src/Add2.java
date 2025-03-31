package src;
import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("숫자만 입력해주세요: ");
        num1 = sc.nextInt();
        System.out.print("숫자만 입력해주세요: ");
        num2 = sc.nextInt();
        System.out.print("두 수의 합은 " + num1 + num2 + "입니다.");

    }
}
