package onlineclasses;

import java.util.Scanner;
/*pattern1:n=3
 * ****
 * ****
 * ****
 * pattern2:n=4
 * 1
 * 12
 * 123
 * 1234
 * pattern 3:n=3
 * A
 * AB
 * ABC
 *pattern 4:n=3
 *$$$
 *$ $
 *$$$ */
public class IterativeStatements {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("choose pattern number");
		int pattern = scan.nextInt();
		System.out.println("enter number");
		int n = scan.nextInt();
		
		switch (pattern) {
		case 1:
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 2:
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			break;
		case 3:
			for (int i = 1; i <= n; i++) {
				char a = 65;
				for (int j = 1; j <= i; j++, a++) {
					System.out.print(a);
				}
				System.out.println();
			}
			break;
		case 4:
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == 1 || i == n || j == 1 || j == n)
						System.out.print("$");
					else
						System.out.print(" ");

				}
				System.out.println();
			}
			break;
		default:
			System.out.println("choose the valid option");

		}

	}

}
