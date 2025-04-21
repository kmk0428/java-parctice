package Calc;
import java.util.Scanner;

public class project_7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //변수선언
        int menu = 0, size = 0, option = 0, price = 0;

        //메뉴 선택
        System.out.print("메뉴를 선택해 주세요 \n 1. 아메리카노(3000원) \n 2. 카페라떼(4000원) \n 3. 카푸치노(4500원) \n");
        menu = sc.nextInt();
        //사이즈 선택
        System.out.print("사이즈를 선택해 주세요 \n 1. 작게(무료) \n 2. 중간(500원) \n 3. 크게(1000원) \n");
        size = sc.nextInt();
        //옵션 선택
        System.out.print("옵션을 선택해 주세요 \n 1. 기본(무료) \n 2. 샷 추가(300원) \n 3. 시럽추가(500원) \n 4. 샷과 시럽 추가(800원) \n");
        option = sc.nextInt();

        //예외처리
        if ((menu != 1 && menu != 2 && menu != 3) || (size != 1 && size != 2 && size != 3) || (option != 1 && option != 2 && option != 3 && option != 4)) {
            System.out.println("잘못 입력 하였습니다.");
                return;
        }

        //가격 계산
        //메뉴 가격
        if (menu == 1) {
            price = 3000;
        }
        else if (menu == 2) {
            price = 4000;
        }
        else {
            price = 4500;
        }

        //사이즈 가격
        if (size == 2) {
            price += 500;
        }
        else if (size == 3) {
            price += 1000;
        }

        //옵션 가격
        if (option == 2) {
            price += 300;
        }
        else if (option == 3) {
            price += 500;
        }
        else if (option == 4) {
            price += 800;
        }

        //결과 출력
        System.out.println("음료의 가격은 " + price + "원 입니다.");
    }
}
