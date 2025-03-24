package src;

public class _25032404 {
    public static void main(String[] args) {
        int language = 95;
        int english = 83;
        int math = 78;
        int science = 95;
        int subject = 4;

        //정수의 합
        int score_sum = language + english + math + science;
        System.out.println("정수 점수의 총점은 " + score_sum);

        //정수의 평균
        int score_mean  = score_sum / subject;
        System.out.println("정수 점수의 평균은 " + score_mean);

        //실수의 평균
        double real_score = (double) score_sum / subject;
        System.out.println("실수 평균은 " + real_score);

        //실수의 평균과 정수의 평균이 같은가?
        if (real_score == score_mean) {
            System.out.println("정수와 실수의 평균이 같습니다.");
        }
        else {
            System.out.println("정수와 실수가 다름니다.");
        }
    }
}
