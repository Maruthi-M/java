package onlineclasses;
//when method is final-we cann't override that method
//when class is final-we can't extends that class
final class FinalDemoSuper
{
	final int v;
	public final void display()
	{
		System.out.println("In class A");
	}
	public FinalDemoSuper()
	{
		v=90;
		//v=897;//again intialisation is not posiible
		
	}
}
class FinalDemoSub //extends FinalDemoSuper
{
	public void display()
	{
		System.out.println("In class B");
	}
}
public class FinalKeywordDemo {

	public static void main(String[] args) {
		final double PI=3.14;
		FinalDemoSub obj=new FinalDemoSub();
		obj.display();
		
		
	}
	public FinalKeywordDemo()
	{
		//PI = 90.89;//not possible to change
	}
}
