package com.java.oops;
import java.util.*;
public class EmployeeElc {

	public static void main(String[] args) 
	{
		
		EmployeeBlc E1=new EmployeeBlc();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String firstName=sc.nextLine();
		
		System.out.println("Enter your last name");
		String lastName=sc.nextLine();
		
		System.out.println("Enter your id ");
		int employeeId=sc.nextInt();
		
		System.out.println("Enter salary");
		double salary=sc.nextDouble();
		
		System.out.println("enter no of project");
		int noOfProject=sc.nextInt();
		
		E1.calculateSalary();
		E1.Details();
		
	}

}
