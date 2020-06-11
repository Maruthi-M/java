package onlineclasses;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		//int a[]=new int[9];//static array
		//int a[]= {1,2,3,4,5,6};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter"+n+"elements");
		for(int i=0;i<n;i++)
		{
			int v=sc.nextInt();
			a[i]=v;
		}
		for(int i:a)
		{
			System.out.print(i);
		}

	}

}
