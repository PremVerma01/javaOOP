package com.java.oops;
import java.util.*;
public class Customer2Elc {

	public static void main(String[] args)
	{
	 Customer2Blc king=new Customer2Blc();
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the name");
	 String name=sc.nextLine();
	 king.name=name;
	 
	 System.out.println("Enter number ");
	 int number=sc.nextInt();
	 king.number=number;
	 
	 System.out.println(" Enter id");
	 int id=sc.nextInt();
	 king.id=id;
	 
	 king.CustomerData();
	 king.CustomerFunc();
	}

}
