package onlineclasses;

import java.util.Scanner;

public class TwoDDynamicArray {

	public static void main(String[] args) {
		int r,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of rows and cols");
		 r=scan.nextInt();
		 c=scan.nextInt();
		System.out.println("enter "+r*c+" elements");
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		for(int i[]:a)//enhanced for loop
		{
			for(int j:i)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
