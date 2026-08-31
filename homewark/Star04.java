package homewark;

import java.util.Scanner;

public class Star04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {

            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}