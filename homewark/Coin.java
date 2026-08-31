package homewark;

import java.util.Scanner;

public class Coin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("금액 : ");
        int money = sc.nextInt();

        int coin500 = money / 500;
        int coin100 = (money % 500) / 100;

        System.out.println("동전의 수 >");
        System.out.println("500원짜리 = " + coin500 + "개");
        System.out.println("100원짜리 = " + coin100 + "개");

        sc.close();
    }
}