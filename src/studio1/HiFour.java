package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("s0:");
		String s0 = in.nextLine();
		System.out.print("s1:");
		String s1 = in.nextLine();
		System.out.print("s2:");
		String s2 = in.nextLine();
		System.out.print("s3:");
		String s3 = in.nextLine();
		//
		// Say hello to the names in s0 through s3.
		//
		System.out.print("Greetings " + s0 +", " + s1 + ", "+ s2 + ", and " + s3+".");
		
	}
}
