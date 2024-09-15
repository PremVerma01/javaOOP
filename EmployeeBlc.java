package com.java.oops;

public class EmployeeBlc
{
private String firstName;
private String lastName;
private int employeeId;
private double salary;
private int noOfProject;

public void setEmployeeData(String fname,String lname,int id,double eSalary,int eProject)
   {
	this.firstName=fname;
	this.lastName=lname;
	this.employeeId=id;
	this.salary=eSalary;
	this.noOfProject=eProject;
   }


public void  Details()
{
	System.out.println("name is "+firstName);
	System.out.println(" "+lastName);
	System.out.println("id is "+employeeId);
	System.out.println("no OF Project is "+noOfProject);
	System.out.println("salary is "+salary);
	
}
public void calculateSalary()

{
	if(noOfProject>5 && noOfProject<10)
	{
	salary+=5000;
	}
	else if(noOfProject>10 && noOfProject<20)
	{
	salary+=10000;
	}
	else if(noOfProject>20)
	{
	salary+=15000;
	}

	}
	
}

