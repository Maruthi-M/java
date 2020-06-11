package onlineclasses;
//student class is in OneDObjectArray class
import java.util.Scanner;

public class OneDDynamicObjectArray {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of students needed");
		int n=scan.nextInt();
		Student[] s=new Student[n];
		System.out.println("enter"+n+"student details");
		for(int i=0;i<n;i++)
		{
		Student.sid=scan.nextInt();
		Student.section=scan.next();
		s[i]=new Student(Student.sid,Student.section);
		}
	}

}
