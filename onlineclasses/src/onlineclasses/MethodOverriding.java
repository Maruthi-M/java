package onlineclasses;
class c1
{
	public int add(int a,int b)
	{
		System.out.println("in class c1");
		return a+b;
	}
	public void show()
	{
		System.out.println("in class A");
	}
	
} 
class c2 extends c1
{
	
	public int add(int a,int b)
	{
		System.out.println("in class c2");
		return a+b;
	}
	
}
class c3 extends c1
{
//	public void show()
//	{
//		System.out.println("in class C");
//	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		c1 cobj=new c2();
	System.out.println(cobj.add(2, 3));
	cobj=new c3();//dynamic method dispatch
	cobj.show();
		

	}

}
