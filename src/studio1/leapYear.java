package studio1;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("year?");
		int year = in.nextInt();
		Boolean leapYear = (year % 4 == 0)||(year % 10 != 0)||(year % 400 ==0);
		System.out.println(year + "is a leap year:" + leapYear);
		
	}

}
