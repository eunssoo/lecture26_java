package assignment;

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("초 단위 정수를 입력하세요 : ");
        int totalSecond = input.nextInt();

        int hour = totalSecond / 3600;
        int minute = (totalSecond % 3600) / 60;
        int second = totalSecond % 60;

        System.out.println(hour + "시간 " + minute + "분 " + second + "초");
    }
}