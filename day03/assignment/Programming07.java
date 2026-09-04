package assignment;

import java.util.Scanner;

public class Programming07 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String c = input("철수");
        String y = input("영희");

        whosWin(c, y);
    }

    static String input(String name) {

        System.out.print(name + " : ");

        return input.next();
    }

    static void whosWin(String c, String y) {

        if (c.equals(y)) {
            System.out.println("무승부!");
        } 
        else if ((c.equals("r") && y.equals("s")) ||
                 (c.equals("s") && y.equals("p")) ||
                 (c.equals("p") && y.equals("r"))) {

            System.out.println("철수, 승!");
        } 
        else {
            System.out.println("영희, 승!");
        }
    }
}