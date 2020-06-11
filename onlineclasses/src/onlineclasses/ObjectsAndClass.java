package onlineclasses;
class Calculator
{
	int num1;
	int num2;
	int num3;
	int result;
	public void addOperation()
	{
		result=num1+num2;
	}
	public Calculator(int num1,int num2)
	{
		this.num1=num1;//to refer the class variables we use this keyword here---current object
		this.num2=num2;
	}
	Calculator(int num1,int num2,int num3)
	{
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	
}

public class ObjectsAndClass {
	public static void main(String args[])
	{
		Calculator c=new Calculator(90,89);
		//c.num1=6;
		//c.num2=4;
		c.addOperation();
		System.out.println(c.result);
		Calculator c1=new Calculator(90,89,90);
		System.out.println(c1.num3);
	}
	

}
