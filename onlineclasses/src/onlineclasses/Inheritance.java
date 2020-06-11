package onlineclasses;
//deriving properties from one class to another class
//in this example class A cann't access the unique methods of class B.But class B can access the all the features of class A
//only methods are deriving.in this example add method is derived from class A to class B.
class A
{
	public A()
	{
		System.out.println("in class A");
	}
	public int add(int a,int b)
	{
		System.out.print("class A-add");
		return a+b;
	}
	public void display()
	{
		System.out.println("display() in A");
	}
	
}
class B extends A
{
	public void display()
	{
		super.display();//used to refer the super class objects
		System.out.println("display() in B");
	}
	
}
public class Inheritance {

	public static void main(String[] args) {
		B bobj=new B();
		bobj.display();
		System.out.println(bobj.add(3, 5));
		
	}

}
