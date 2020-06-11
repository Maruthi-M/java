package onlineclasses;

public class TwoDArray {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {2,2,4};
		int[] c= {3,4,5};
		//int[][] d= {{1,2,3},{2,2,4},{3,4,5}};
		int[][] d= {a,b,c};
		for(int i[]:d)//enhanced for loop
		{
			for(int j:i)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
