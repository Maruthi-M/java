package onlineclasses;
//interfaces specify only what the class is doing, not how it is doing it.
//The problem with multiple inheritance is that two classes may define different ways of doing the same thing,
//and the subclass can't choose which one to pick.
interface Interface1
{
	void m1();
	default void show()
	{
		System.out.println("In addInterface");
	}
	
}
interface Interface2
{
	void m1();
	default void show()
	{
		System.out.println("In addInterface");
	}
	
}
class AImple implements Interface1,Interface2
{
	public void m1()
	{
		System.out.println("m1 method");
	}

	@Override//to overcome from ambiguity
	public void show() {
		
		Interface2.super.show();
	}

}
public class MultipleInterface {

	public static void main(String[] args) {
		AImple obj=new AImple();
		obj.m1();
		obj.show();

	}

}
