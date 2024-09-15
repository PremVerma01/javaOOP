package com.java.oops;
import java.util.*;
public class CustomerElc 
{

	public static void main(String[] args) 
	{
		CustomerBlc raj= new CustomerBlc();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your id");
		 int id1=sc.nextInt();
		 raj.id=id1;
		 
		 
		// Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your name");
		 String name1=sc.nextLine();
		 raj.name=name1;
		 
		// Scanner sc1=new Scanner(System.in);
		 System.out.println("Enter your phone number");
		 int num1=sc.nextInt();
		 raj.number=num1;
			
		 
		//Scanner sc= new Scanner(System.in);
		System.out.println("Enter the bill");
		int bill1=sc.nextInt();
		raj.bill=bill1;
         
		
		raj.CustBill();
		raj.CustDetails();
		sc.close();
	}

}
