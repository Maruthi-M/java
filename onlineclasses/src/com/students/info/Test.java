package com.students.info;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
	static ArrayList<Students> list=new ArrayList<>();
	 static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("WELCOME......");
		int choice=0;
		while(choice!=5) {
			System.out.println("1.Add student\n"+"2.All Students\n"+"3.delete student\n"+"4.search student\n"+"5.exit");
			try {
		choice=scan.nextInt();
		switch(choice)
		{
		case 1:System.out.println("ADD student details ID,name,class,mobileno,address");
//		list.add(new Students(9,"mm",9,"9089767867","allur"));
//		list.add(new Students(1,"mt",5,"9089767867","allur"));
		addStudent();
		//System.out.println("new student added....");
				break;
		case 2:System.out.println("All Students.....");
				display();
				break;
		case 3:System.out.println("enter student Id..");
				delete();
				System.out.println("student deleted");
				break;
		case 4:search();
				break;
		case 5:System.out.println("exit...");
				break;
		default:System.out.println("choose the right option");
		}
			}
			catch(Exception e)
			{
				System.err.println("input missmatch expected INT");
				scan.next();
			}
		}
	}
	//student methods
	public static void addStudent()
	{
		Students s=new Students();
		try {
			int r=0;
		int sid=scan.nextInt();
		String sName=scan.next();
		int sClass=scan.nextInt();
		String mobileNumber=scan.next();
		String address=scan.next();
		s.setSid(sid);
		s.setsName(sName);
		s.setSclass(sClass);
		s.setMobileNumber(mobileNumber);
		s.setAddress(address);
		//list.add(s);
		for(Students st:list)
		{
			if(st.getSid()==sid)
			{
				r=1;
				System.out.println("student already exist with Id:"+sid);
				break;
			}
		}
		if(r==0)
		{
			list.add(s);
		}
		}
		catch(Exception e)
		{
			System.err.println("input missMatch");
			scan.next();
		}
	}
	public static void display()
	{
		for(Students stud:list)
		{
		System.out.println(stud);
		}
	}
	public static void delete()
	{
		int id=scan.nextInt();
		for(int j=0;j<list.size();j++)
		{
			Students stud=list.get(j);
			if(stud.getSid()==(id))
			{
				list.remove(j);
				break;
			}
		}
		System.out.println("deleted.."+"remaining studemts count"+list.size());
	}
	public static void search()
	{
		System.out.println("enter studentId");
		int id=scan.nextInt();
		for(int j=0;j<list.size();j++)
		{
			Students stud=list.get(j);
			if(stud.getSid()==(id))
			{
				System.out.println(stud);
			}
			else
			{
				System.out.println("student doesn't exist with Id:"+id);
			}
		}
	}
}
