package onlineclasses;
//in this example resources are closed automatically
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {

	public static void main(String[] args) throws IOException{
		int n=0;
		System.out.println("enter number");
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
			 n=Integer.parseInt(br.readLine());
		}
		System.out.println(n);
	}

}
