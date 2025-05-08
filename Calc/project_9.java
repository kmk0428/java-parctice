package Calc;
import java.util.Scanner;


public class project_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //변수 선언
        int score = 0;
        String score_name = "";

        //점수 입력
        System.out.println("점수를 입력해 주세요: ");
        score = sc.nextInt();

        //오류 검출
        if (score > 100 || score < 0) {
            System.out.println("점수 입력이 잘못 되었습니다.");
            return;
        }

        //단순화
        score /= 10;

        //선택 조건문
        switch (score) {
            case 10, 9:
                score_name = "A";
                break;
            case 8:
                score_name = "B";
                break;
            case 7:
                score_name = "C";
                break;
            case 6:
                score_name = "D";
                break;
            default:
                score_name = "F";
                break;
        }

        System.out.println("당신의 학점은 " + score_name + "입니다");
    }
}
