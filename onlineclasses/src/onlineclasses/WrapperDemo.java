package onlineclasses;
//java is object oriented language.so everything we need to pass as an object.but we use primitive datatypes.primitive works 
//fatser than wrapper class.hibernate,collections support wrapper classes.
public class WrapperDemo {

	public static void main(String[] args) {
		int i=90;//primitive types
		System.out.println("using primitives:"+i);
		Integer i1=new Integer(100);       //wrapper class -boxing
		int j=i1.intValue();               //unwrapping-unboxing
		System.out.println("using Integer:"+j);
		Integer i2=900;                       //auto-boxing
		int j1=i2;                            //auto-unboxing
		System.out.println("Integer:"+j1);
		String number="908978";
		int n1=Integer.parseInt(number);
		System.out.println(n1);

	}

}
