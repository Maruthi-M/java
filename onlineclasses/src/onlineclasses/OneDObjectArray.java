package onlineclasses;
//static object array
class Student
{
	static int sid;
	static String section;
	public Student(int sid,String section)
	{
		this.sid=sid;
		this.section=section;
		System.out.println(sid+" "+section);
	}
}
public class OneDObjectArray {

	public static void main(String[] args) {
		Student mm=new Student(1,"9th");
		Student mt=new Student(2,"8th");
		Student mr=new Student(2,"8th");
		Student[] s= {mm,mt,mr};	
	}

}
