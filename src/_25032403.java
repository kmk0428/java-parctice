public class _25032403 {
    public static void main(String[] args) {
        // 주어진 값들
        double doubleValue = 2.71828;

        // double에서 다른 타입으로의 형변환 결과 출력
        System.out.println("\n=== double 형변환 ===");
        // byte, short, int, long이 네가지는 데이터의 크기만 다른 정수형으로 소수점 뒤의 자리값은 받지 않는다.
        //byte < short < int < long
        System.out.println("1. double -> byte: " + (byte)doubleValue);
        System.out.println("2. double -> short: " + (short)doubleValue);
        System.out.println("3. double -> int: " + (int)doubleValue);
        System.out.println("4. double -> long: " + (long)doubleValue);
        //float는 doulbe 같은 실수형으로 float는 doulbe보다 적은 소수점 뒤의 자리값을 받을 수 있다.
        System.out.println("5. double -> float: " + (float)doubleValue);
    }
}