package onlineclasses;
//abstract-hiding the implementation details.we can use abstract at class and method level.
//abstract class contains-both abstarct and concrete methods
//we cann't create object for abstract class
abstract class Humans
{
	public abstract void eat();
	public abstract void walk();
	public void think()
	{
		System.out.println("In think method");
	}
}
class Women extends Humans
{
	public void eat()
	{
		System.out.println("In eat method");
	}
	public void walk()
	{
		System.out.println("In walk method");
	}
}
public class AbstractDemo{
	public static void main(String args[])
	{
		Humans obj=new Women();
		obj.eat();
		obj.walk();
		obj.think();
	}
	
}
