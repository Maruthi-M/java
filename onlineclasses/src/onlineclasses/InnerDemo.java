package onlineclasses;
class Course
{
private Stud[] s;
private String course;


public Stud[] getS() {
	return s;
}


public void setS(Stud[] s) {
	this.s = s;
}


public String getCourse() {
	return course;
}


public void setCourse(String course) {
	this.course = course;
}

public void show()
{
	System.out.println("in show()");
}
static class Stud
{
	private int sid;
	private String sName;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}	
	public void display()
	{
		System.out.println("in display()");
	}
}
}
public class InnerDemo {

	public static void main(String[] args) {
		Course cobj=new Course();
		cobj.show();
		Course.Stud sobj=new Course.Stud();
		sobj.display();
	}

}
