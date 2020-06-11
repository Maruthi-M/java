package onlineclasses;
/*static variables works for objectname and classname
 * ex:
 * maruthi.ceo="vinod"(or)
 * Employee.ceo="vinod"
 * we can access only static variables inside a static method
 * */
class Employee
{
	int eid;
	int salary;
	static String ceo;
	static String companyName;
	public void display() {
		System.out.println(eid+"-"+salary+"-"+ceo+"-"+companyName);
		
	}
	static
	{
		companyName="CTS";
		System.out.println("inside second static block");
	}
	static
	{
		ceo="v.vinod";
		System.out.println("in static block");//executes only once when the class loads
	}
	
	
	public Employee()
	{
		eid=12;
		salary=25000;
		System.out.println("In employee constructor");//loads for each instance
		
	}
	public Employee(int i, int j) {
		this.eid=i;
		this.salary=j;
		System.out.println("employee parameterized constructor");//loads for each instance
	}
	
}
public class StaticKeyword {
	public static void main(String args[])
	{
		Employee maruthi=new Employee(100,25000);
		Employee tanuja=new Employee();//print values from default constructor
		Employee manasa=new Employee();
		maruthi.display();
		tanuja.display();
		manasa.display();
		
	}

}
