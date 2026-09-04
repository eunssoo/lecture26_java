package assignment;

import java.util.Scanner;

public class Programming06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("철수 : ");
        String c = input.next();

        System.out.print("영희 : ");
        String y = input.next();

        if (c.equals(y)) {
            System.out.println("무승부!");
        }

        else if (
            (c.equals("r") && y.equals("s")) ||
            (c.equals("s") && y.equals("p")) ||
            (c.equals("p") && y.equals("r"))
        ) {
            System.out.println("철수, 승!");
        }

        else {
            System.out.println("영희, 승!");
        }
    }
}