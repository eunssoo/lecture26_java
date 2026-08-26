package assignment;

import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("0~999 사이의 숫자를 입력하세요 : ");
        int num = input.nextInt();

        int hundred = num / 100;
        int ten = (num % 100) / 10;
        int one = num % 10;

        int sum = hundred + ten + one;

        System.out.println("각 자릿수의 합 = " + sum);
    }
}