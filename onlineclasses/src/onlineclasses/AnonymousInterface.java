package onlineclasses;
interface Abc
{
	void display();
}
public class AnonymousInterface {

	public static void main(String[] args) {
		Abc obj=new Abc()
				{
				public void display()
				{
					System.out.println("anonymous class in interface");
				}
				};
		obj.display();
		
	}

}
