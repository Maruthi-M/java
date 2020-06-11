package onlineclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Students implements Comparable<Students>
{
	int sid;
	String sName;
	int sAge;
	public Students(int sid, String sName, int sAge) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.sAge = sAge;
	}
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sName=" + sName + ", sAge=" + sAge + "]";
	}
	public int compareTo(Students s)
	{
		
		//return sAge>s.sAge?1:-1;
		//System.out.println("this:"+sName+" value:"+s.sName);
		//return sName.length()>s.sName.length()?1:-1;
		//return sName.contains("M")?1:-1;
		System.out.println("this:"+sid+"value:"+s.sid);
		return sid>s.sid?1:-1;
	}	
}
public class ComparableDemo {

	public static void main(String[] args) {
		List<Students> s=new ArrayList<>();
		s.add(new Students(10,"ab",14));
		s.add(new Students(2,"abc",11));
		s.add(new Students(6,"a",17));
		s.add(new Students(7,"abcd",15));
		Collections.sort(s);
		//Collections.sort(s,(i,j)->i.sAge>j.sAge?1:-1);
		for(Students student:s)
		{
			System.out.println(student);
		}
	}

}
