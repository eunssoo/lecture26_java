package assignment;

import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("원기둥의 밑면 반지름은? ");
        int radius = input.nextInt();

        System.out.print("원기둥의 높이는? ");
        int height = input.nextInt();

        double volume = 3.14 * radius * radius * height;

        System.out.println("원기둥의 부피는 " + volume);
    }
}