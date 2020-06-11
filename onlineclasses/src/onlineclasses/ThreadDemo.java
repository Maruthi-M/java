package onlineclasses;
//every java program contains atleast one thread-(main thread)
//threads can implemented in two ways-1.by extending class,2.by implementing interface

class Hi extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("hi..");
		try {
		Thread.sleep(1000);
		}
		catch(Exception e) {}
	}
	}	
	
}
class Welcome extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++) {
		System.out.println("welcome to java");
		try {
		Thread.sleep(1000);}
		catch(Exception e) {}
		}
	}
	
}
public class ThreadDemo {

	public static void main(String[] args) throws Exception{
		Hi obj=new Hi();
		Welcome obj1=new Welcome();
		obj.start();
		Thread.sleep(10);
		obj1.start();
		

	}

}
