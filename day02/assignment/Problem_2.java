package assignment;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = in.nextInt();

        String result = (num % 2 == 0) ? "짝수" : "홀수";
// 삼항연산자
        System.out.println(result);
    }
}