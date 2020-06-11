package onlineclasses;

import java.util.Scanner;

public class SelectionStatements {

	public static void main(String[] args) {
		System.out.println("enter ur choice");
		System.out.println("1.ifelse");
		System.out.println("2.Ternary");
		Scanner scan=new Scanner(System.in);
		String n=scan.next();
		System.out.println("enter age");
		int age=scan.nextInt();
		switch(n)
		{
		case "ifelse"://string supported from 1.7version onwards
			callingIfElse(age);
			break;
		case "ternary":
			callingTernary(age);
			break;
		default:
			System.out.println("Incorrect value");
		}
	}
	/*A static method is one type of method which doesn't need any object to be initialized for it to be called. 
	 * Have you noticed static is used in the main function in Java?
	 *  Program execution begins from there without an object being created.*/
	public static  void callingIfElse(int a)
	{
		if(a>18)
			System.out.print("if-else::person eligible for voting");
		else
			System.out.println("if-esle::person not eligible for voting");
	}
	public static void callingTernary(int a)
	{
		System.out.println((a>18?"ternary::person eligible for voting":"ternary::person not eligible for votings"));
	}
}
