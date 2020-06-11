package onlineclasses;
//encapsulation:wrapping of data into single unit or binding data through methods 
//while assigning values instead of calling varible directly we use getters and setters
public class EncapsulationDemo {

	public static void main(String[] args) {
		Employees emp=new Employees();
		//emp.eid=100;->instead of assigning directly we use getters and setters
		emp.setEid(100);
		emp.setEname("ravi");
		emp.setSalary("23000");
		System.out.println(emp.getEid()+" "+emp.getEname()+" "+emp.getSalary());

	}

}
