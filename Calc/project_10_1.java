package Calc;

public class project_10_1 {
    public static void main(String[] args) {

        //변수 초기화
        int sum = 0;

        //반복문 시작
        for (int i  = 1; i <= 1000; i++) {
            //짝수 필터
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1부터 1000까지의 짝수의 합은 " + sum + "입니다.");
    }
}
