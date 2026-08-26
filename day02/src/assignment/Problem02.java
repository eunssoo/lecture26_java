package assignment;

import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = input.nextInt();

        int square = num * num;

        System.out.println(num + "의 제곱은 " + square);
    }
}