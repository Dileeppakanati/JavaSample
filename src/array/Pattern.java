package array;

import java.util.Scanner;

//import.java. util.*:

public class Pattern {

	public static void main(String[] args) {
		// int i, n;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			// System.out.println(i / n);
           
			if (i <= 5) {
				System.out.println(i);
			} else {
				System.out.print(i);

			}
		}
	}
}
