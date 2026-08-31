package homewark;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int number = sc.nextInt();

        switch (number % 2) {
            case 0:
                System.out.println("짝수입니다.");
                break;

            default:
                System.out.println("홀수입니다.");
        }

        sc.close();
    }
}