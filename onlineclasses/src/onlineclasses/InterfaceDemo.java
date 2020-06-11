package onlineclasses;
interface Writer
{
	void write();
}
class Pen implements Writer
{
	public void write()
	{
		System.out.println("In pen()");
	}
}
class Pencil implements Writer
{
	public void write()
	{
		System.out.println("In pencil()");
	}
}
class Kit
{
	public void dosomething(Writer pobj)
	{
		pobj.write();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Writer pobj=new Pen();
		Writer peobj=new Pencil();
		Kit kobj=new Kit();
		kobj.dosomething(pobj);
		kobj.dosomething(peobj);
		
	}

}
