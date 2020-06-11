package onlineclasses;
interface Add
{
	int add(int a,int b);
	default void show()
	{
		System.out.println("From 1.8v java supports defining methods");
	}
}
class AddImple implements Add
{
public int add(int a,int b)
{
	System.out.println("in add method");
	return a+b;
}
}
public class InterfaceDefaultMethods {

	public static void main(String[] args) {
		//AddImple obj=new AddImple();
		Add obj=new AddImple();
		obj.show();
		System.out.println(obj.add(2,3));
	}

}
