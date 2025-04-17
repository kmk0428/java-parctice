package Calc;
import java.util.Scanner;

public class project_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //변수 선언
        double language = 0, english = 0, math = 0, science = 0, score_sum = 0, real_score = 0;
        int score_mean = 0;

        //입력
        System.out.print("국어 점수를 입력: ");
        language = sc.nextDouble();
        System.out.print("영어 점수를 입력: ");
        english = sc.nextDouble();
        System.out.print("수학 점수를 입력: ");
        math = sc.nextDouble();
        System.out.print("과학 점수를 입력: ");
        science = sc.nextDouble();

        //정수의 합
        score_sum = language + english + math + science;
        System.out.println("정수 점수의 총점은 " + score_sum);

        //정수의 평균
        score_mean = (int)score_sum / 4;
        System.out.println("정수 점수의 평균은 " + score_mean);

        //실수의 평균
        real_score = score_sum / 4;
        System.out.println("실수 평균은 " + real_score);

        //실수의 평균과 정수의 평균이 같은가?
        System.out.print("정수와 실수의 평균은 같은가?" + (score_mean == real_score));
    }
}
