package onlineclasses;

import java.util.Scanner;

public class ExceptionHandlingExample {
	public static void main(String args[]) {
		System.out.println("WELCOME..................");
		m1();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while (choice <= 5) {
			try {
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter 2 values");
				try {
				int a1 = scan.nextInt();
				int a2 = scan.nextInt();
				add(a1, a2);
				}
				catch(Exception e)
				{
					System.out.println("check the value u entered");
					scan.next();
				}
				m1();
				break;
			case 2:
				System.out.println("enter 2 values");
				try {
				int b1 = scan.nextInt();
				int b2 = scan.nextInt();
				sub(b1, b2);
				}
				catch(Exception e)
				{
					System.out.println("check the value u entered");
					scan.next();
				}
				m1();
				break;
			case 3:
				System.out.println("enter 2 values");
				try {
				int m1 = scan.nextInt();
				int m2 = scan.nextInt();
				mul(m1, m2);
				}
				catch(Exception e)
				{
					System.out.println("check the value u entered");
					scan.next();
				}
				m1();
				break;
			case 4:
				System.out.println("enter 2 values");
				try {
				int d1 = scan.nextInt();
				int d2 = scan.nextInt();
				div(d1, d2);
				}
				catch(Exception e)
				{
					System.out.println("check the value u entered");
					scan.next();
				}
				m1();
				break;
			case 5:
				System.out.println("enter 2 values");
				try {
				int mo1 = scan.nextInt();
				int mo2 = scan.nextInt();
				modulo(mo1, mo2);
				}
				catch(Exception e)
				{
					System.out.println("check the value u entered");
					scan.next();
				}
				m1();
				break;
			case 6:
				System.out.println("while..loop..exit");
				break;
			default:
				System.out.println("choose the right option!");
			}
		}
			catch(Exception e)
			{
				System.out.println("error");
				scan.next();
			}
		}
	}

	private static void add(int a1, int a2) {
		System.out.println(a1 + a2);
	}

	private static void sub(int s1, int s2) {
		try {
			int s=s1-s2;
			if(s<0)
			{
				throw new MyException("result value is in -ve");
			}
		System.out.println(s);
		}
		catch(MyException e)
		{
			System.err.println(e.getMessage());
		}
	}

	private static void m1() {
		System.out.println("1.add\n" + "2.sub\n" + "3.mul\n" + "4.div\n" + "5.modulo\n" + "6.exit");
	}

	private static void mul(int m1, int m2) {
		System.out.println(m1 * m2);
	}

	private static void div(int d1, int d2) {
		int d=d1/d2;
		try {
			if(d==0)
		throw new MyException("quotient value is 0....enter the correct input");
			System.out.println(d);
		}
		catch(MyException e)
		{
			System.err.println(e.getMessage());
		}
		
	}

	private static void modulo(int mo1, int mo2) {
		System.out.println(mo1 % mo2);
	}

}
