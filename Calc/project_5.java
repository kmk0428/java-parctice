package Calc;
import java.util.Scanner;

public class project_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //변수 선언
        double language, english, math, science, score_sum, real_score;
        int score_mean;
        //입력
        System.out.print("국어 점수를 입력: ");
        language = 55; //sc.nextDouble();
        System.out.print("영어 점수를 입력: ");
        english = 60; //sc.nextDouble();
        System.out.print("수학 점수를 입력: ");
        math = 80; //sc.nextDouble();
        System.out.print("과학 점수를 입력: ");
        science = 85; //sc.nextDouble();

        //정수의 합
        score_sum = language + english + math + science;
        System.out.println("정수 점수의 총점은 " + score_sum);

        //정수의 평균
        score_mean  = (int)score_sum / 4;
        System.out.println("정수 점수의 평균은 " + score_mean);

        //실수의 평균
        real_score = score_sum / 4;
        System.out.println("실수 평균은 " + real_score);

        //실수의 평균과 정수의 평균이 같은가?
        if (real_score == score_mean) {
            System.out.println("정수 평균과 실수 평균이 같습니다.");
        }
        else {
            System.out.println("정수 평균과 실수 평균이 다름니다.");
        }
    }
}
