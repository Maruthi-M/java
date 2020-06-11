package onlineclasses;
//Types of interfaces
//1.normal-more than one method
//2.single abstract method-Functional interface
//3.marker interface-no methods ex:Serializable
interface Lamdainterface
{
	void show();
}
public class LamdaDemo {

	public static void main(String[] args) {
		Lamdainterface obj=()->System.out.println("show method implementation through lamda expression");
		obj.show();

	}

}
