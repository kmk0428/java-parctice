package src;

public class _25032403 {
    public static void main(String[] args) {
        // 주어진 값들
        double doubleValue = 2.71828;

        // double에서 다른 타입으로의 형변환 결과 출력
        System.out.println("\n=== double 형변환 ===");
        System.out.println("1. double -> byte: " + (byte)doubleValue);
        //doubleValue 변수의 값을 double -> byte로 형변환을 하여 정수형으로 전환 되어 소수점 뒷자리를 받지 안는다. 따라서 2 출력
        System.out.println("2. double -> short: " + (short)doubleValue);
        //doubleValue 변수의 값을 double -> short 형변환을 하여 정수형으로 전환 되어 소수점 뒷자리를 받지 안는다. 따라서 2 출력
        System.out.println("3. double -> int: " + (int)doubleValue);
        //doubleValue 변수의 값을 double -> int 형변환을 하여 정수형으로 전환 되어 소수점 뒷자리를 받지 안는다. 따라서 2 출력
        System.out.println("4. double -> long: " + (long)doubleValue);
        //doubleValue 변수의 값을 double -> long 형변환을 하여 정수형으로 전환 되어 소수점 뒷자리를 받지 안는다. 따라서 2 출력
        System.out.println("5. double -> float: " + (float)doubleValue);
        //float는 doulbe 같은 실수형으로 double -> float로 형변환을 하여도 소수점 뒤의 자리값을 받을 수 있다. 따라서 2.71828 출력
    }
}