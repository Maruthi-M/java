package onlineclasses;

public class Employees {
	private int eid;
	private String ename;
	private String salary;
	public int getEid() {
		System.out.println("inside get eid-for logging purpose");
		return eid;
	}
	public void setEid(int eid) {
		System.out.println("inside set eid-for logging purpose");
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	

}
