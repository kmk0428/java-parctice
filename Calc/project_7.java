package Calc;
import java.util.Scanner;

public class project_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //변수
        int score = 0;
        System.out.println("점수: ");
        score = sc.nextInt();
        String grade  = "";

        //조건
        if (score >= 90) {
            grade = "A";
        }
        else if (score >= 80) {
            grade = "B";
        }
        else if (score >= 70) {
            grade = "C";
        }
        else if (score >= 60) {
            grade = "D";
        }
        else if (score < 50) {
            grade = "F";
        }

        //학점출력
        System.out.println("학점은: " + grade);
        sc.close();

    }
}
