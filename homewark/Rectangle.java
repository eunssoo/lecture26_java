package homewark;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("직사각형의 가로 길이 : ");
        double width = sc.nextDouble();

        System.out.print("직사각형의 세로 길이 : ");
        double height = sc.nextDouble();

        double area = width * height;

        System.out.println("직사각형의 넓이는 " + area + "cm입니다.");

        sc.close();
    }
}