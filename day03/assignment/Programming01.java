package assignment;

import java.util.Scanner;

public class Programming01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("나이를 입력하세요 : ");
        int age = input.nextInt();

        if (age >= 19) {
            System.out.println("성년");
        } else {
            System.out.println("미성년");
        }
    }
}