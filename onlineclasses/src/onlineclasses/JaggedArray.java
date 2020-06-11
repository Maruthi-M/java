package onlineclasses;

public class JaggedArray {

	public static void main(String[] args) {
		int d[][]= {{1,2},{2,3,4},{3,4,5,6,7}};
		for(int i[]:d)//enhanced for loop
		{
			for(int j:i)
			{
				System.out.print(j);
			}
			System.out.println();
		}
//		for(int i=0;i<d.length;i++)//normal for loop
//		{
//			for(int j=0;j<d[i].length;j++)
//			{
//				System.out.print(d[i][j]);
//			}
//			System.out.println();
//		}
	}

}
