package Calc;
import java.util.Scanner;

public class project_10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //변수 초기화
        int sum = 0, sum_limit = 0;

        //더할 범위 지정
        System.out.println("숫자를 입력하세요: ");
        sum_limit = sc.nextInt();

        //반복문 시작
        for (int i  = 1; i <= sum_limit; i++) {
            //홀수 필터
            if (i % 2 != 0) {
                sum += i;
            }
        }
        //결과 출력
        System.out.println("홀수의 합: " + sum);
    }
}
