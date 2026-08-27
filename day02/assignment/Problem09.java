package assignment;

import java.util.Scanner;

public class Problem09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("전공 이수 학점 : ");
		int major = input.nextInt();
		
		System.out.print("교양 이수 학점 : ");
        int liberal = input.nextInt();

        System.out.print("일반 이수 학점 : ");
        int general = input.nextInt();

        int total = major + liberal + general;
        
        boolean condition1 = total >= 140;
        boolean condition2 = major >= 70;
        boolean condition3 = (liberal >= 30 && general >= 30) || (liberal + general >= 80);
        
        if(condition1 && condition2 && condition3) {
        	System.out.println("졸업 가능");
        } else {
        	System.out.println("졸업 불가능");
        }
        
	}

}
