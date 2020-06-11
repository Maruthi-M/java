package onlineclasses;
//we can static methods without creating any object
interface StaticInterfaceDemo
{
	static void display()
	{
		System.out.println("static method in interface");
	}
}
public class StaticMethodInterface {

	public static void main(String[] args) {
		StaticInterfaceDemo.display();
		}

}
