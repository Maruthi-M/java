package onlineclasses;

import java.util.Scanner;

public class Recurion {

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		int n=scan.nextInt();
		print(1);
}

	private static void print(int n) {
		if(n<=100)
		{
			System.out.print(n+",");
			print(n+1);
		}
}
}	
