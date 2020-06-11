package onlineclasses;

public class ExceptionHandling {

	public static void main(String[] args) {
		int i=90;
		int j=0;
		int[] arr=new int[5];
		
		try
		{
			arr[7]=90;
			System.out.println("division:"+i/j);	
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("should not divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("we are accessing out of bounds index");
		}
		catch(Exception e)
		{
			System.out.println("something went wrong:"+e.getMessage());
		}
		finally {
		System.out.println("exception handling demo");
		}

	}

}
