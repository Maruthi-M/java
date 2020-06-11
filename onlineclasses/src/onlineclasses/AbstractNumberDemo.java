package onlineclasses;
class PrintNumber
{
	public void display(Number n)//here i am taking number.Because all the primitive types extends number class
	{
		System.out.println(n);
	}
}
public class AbstractNumberDemo {

	public static void main(String[] args) {
	PrintNumber pn=new PrintNumber();
	pn.display(12);
	pn.display(90878976.90897);
	
	}

}
