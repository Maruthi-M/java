package onlineclasses;
class Outer
{
	int a;
	public void show()
	{
		System.out.println("inside show method");
	}
	static class Inner
	{
		public void display()
		{
			System.out.println("inner-class display method");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		Outer outerobj=new Outer();
		outerobj.show();
		//Outer.Inner innerobj=outerobj.new Inner(); //when class  is non-static
		Outer.Inner innerobj=new Outer.Inner();//when class is static
		innerobj.display();
	}

}
