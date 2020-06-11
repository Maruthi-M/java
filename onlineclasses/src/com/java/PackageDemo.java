package com.java;
//default-specific package
//private-specific class
//public-any class or package
//protected-subsiding package
public class PackageDemo {

	public static void main(String[] args) {
		ModifiersDemo obj=new ModifiersDemo();
		System.out.println("public modifier:"+obj.name);
		System.out.println("default modifier:"+obj.mobileNumber);
		System.out.println("protected modifier:"+obj.getSalary());
		

	}

}
