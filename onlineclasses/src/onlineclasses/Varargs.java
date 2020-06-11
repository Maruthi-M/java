package onlineclasses;
//instead of adding and removing parameters based on requirement.we use variable length arguments here ... accepts array of values
class Cal
{
	public int addOperation(int ... n)
	{
		int sum=0;
		for(int i:n)
		{
			sum+=i;
		}
		return sum;
	}
	
}
public class Varargs {

	public static void main(String[] args) {
		Cal calobj=new Cal();
		System.out.println(calobj.addOperation(2,3,8,5,6,7,9));
	}

}
