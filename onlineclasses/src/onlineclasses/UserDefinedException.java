package onlineclasses;

public class UserDefinedException {
	public static void main(String args[])
	{
		int i=8,j=9;
		try {
			int k=i/j;
			if(k==0)
				throw new MyException("the result never be 0");
			System.out.println(k);
		}
		catch(MyException e)
		{
			System.out.println("error::"+e.getMessage());
		}
	}

}
