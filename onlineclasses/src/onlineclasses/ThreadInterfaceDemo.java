package onlineclasses;
//class Hello implements Runnable 
//{
//	public void run()
//	{
//		for(int i=1;i<=5;i++)
//		{
//		System.out.println("IN hello");
//		try {
//		Thread.sleep(1000);
//		}
//		catch(Exception e) {}
//	}
//	}	
//}
//class HelloWelcome implements Runnable 
//{
//	public void run()
//	{
//		for(int i=1;i<=5;i++)
//		{
//		System.out.println("IN HelloWelcome");
//		try {
//		Thread.sleep(1000);
//		}
//		catch(Exception e) {}
//	}
//	}	
//	
//}
//public class ThreadInterfaceDemo {
//	public static void main(String args[]) throws InterruptedException 
//	{
//		Runnable obj=new Hello();
//		Runnable obj1=new HelloWelcome();
//		Thread t1=new Thread(obj);
//		Thread t2=new Thread(obj1);
//		t1.start();
//		//try{Thread.sleep(10);}catch(Exception e) {}-->In two ways we can handle exception
//		Thread.sleep(10);
//		t2.start();
//		t1.join();
//		t2.join();
//		System.out.println(".......WELCOME to Threads........");
//		
//		
//	}
//
//}
/*lambda expressions,anonymous class applied*/
public class ThreadInterfaceDemo {
	public static void main(String args[]) throws InterruptedException {
		Thread t1 = new Thread(() ->{
			for (int i = 1; i <= 5; i++) {
				System.out.println("hello:->"+Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
				try {Thread.sleep(1000);}catch (Exception e) {}
			}
		});
		Thread t2 = new Thread(()->{
			for (int i = 1; i <= 5; i++) {
				System.out.println("HelloWelcome:->"+Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
				try {Thread.sleep(1000);} catch (Exception e) {}
			}
		});
		t1.setName("HELLO THREAD");
		t1.setPriority(10);
		t2.setName("WELCOME THREAD");
		t1.start();
		// try{Thread.sleep(10);}catch(Exception e) {}-->In two ways we can handle exception
		Thread.sleep(10);
		t2.start();
		System.out.println("T1:"+t1.isAlive()+"T2:"+t2.isAlive());
		t1.join();
		t2.join();
		System.out.println("T1:"+t1.isAlive()+"T2:"+t2.isAlive());
		System.out.println(".......WELCOME to Threads........");
	}
}
