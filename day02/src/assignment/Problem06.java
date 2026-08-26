package assignment;

import java.util.Scanner;

public class Problem06 {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("화씨온도를 입력하세요 : ");
        double fahrenheit = input.nextDouble();

        double celsius = 5.0 / 9.0 * (fahrenheit - 32);

        System.out.println("섭씨온도는 " + celsius + "도입니다.");
    }
}
