package onlineclasses;
//checked Exception are compile time exceptions.it need to handle through try-catch blocks or using throws keyword
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

	public static void main(String[] args) throws IOException{
		int n=0;
		System.out.println("enter number");
		BufferedReader br=null;
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			 n=Integer.parseInt(br.readLine());
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println(n);	
			System.out.println("resoucres closed");
			br.close();
		}
	}

}
