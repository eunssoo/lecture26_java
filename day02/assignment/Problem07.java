package assignment;

import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = input.nextInt();

        System.out.println("4와 5로 모두 나누어지는가? " + (x % 4 == 0 && x % 5 == 0));
        System.out.println("4 또는 5로 나누어지는가? " + (x % 4 == 0 || x % 5 == 0));
        System.out.println("4와 5 중 하나로만 나누어지는가? "
                + ((x % 4 == 0 || x % 5 == 0) && !(x % 4 == 0 && x % 5 == 0)));
    }
}