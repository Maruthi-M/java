package onlineclasses;
//anonymous->A class without name,we create anonymous class for one time use

class A1 {
	public void show() {
		System.out.println("In class A1");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		A1 obj=new A1()
				{
					public void show()
					{
						System.out.println("Anonymous Inner class");
					}
				};
		obj.show();
		
	}

}
