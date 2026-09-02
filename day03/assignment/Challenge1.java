package assignment;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {

        int result;
        int n;

        Scanner in = new Scanner(System.in);

        System.out.print("팩토리얼 값을 구할 정수 : ");
        n = in.nextInt();

        // 1번 방식
        result = 1;

        while (n > 0) {
            result = result * n;
            n--;
        }

        System.out.println(result);


        // 2번 방식 - while(true)
        /*
        result = 1;

        while (true) {

            if (n <= 0) {
                break;
            }

            result = result * n;
            n--;
        }

        System.out.println(result);
        */
    }
}