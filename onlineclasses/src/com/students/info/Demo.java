package com.students.info;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	List<Students> list=new ArrayList<>();
	Scanner scan=new Scanner(System.in);
	int choice=0;
	while(choice!=3)
	{                                        
		System.out.println("1.add,2.display,3.exit");
		choice=scan.nextInt();
		switch(choice)
		{
		case 1:System.out.println("add student id,name,class,mobilenumber,address");
		int sid=scan.nextInt();
		String sName=scan.next();
//		int sClass=scan.nextInt();
//		String mobileNumber=scan.next();
//		String address=scan.next();
		//Students s=new Students(sid,sName,sClass,mobileNumber,address);
		Students s=new Students();
		s.setSid(sid);
		s.setsName(sName);
		list.add(s);
		break;
		case 2:
			for(Students i:list)
			{
				System.out.println(i);	
			}
			break;
		case 3:System.out.println("exit..");
		break;
		}
	}
	
}
}
