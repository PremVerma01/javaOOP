package com.java.oops;

public class DogBlc 
{
   String name;
   double height;
   int age;
   
   public void getDogInformation() 
   {
	   System.out.println("Name of the dog is"+name);
	   System.out.println("Height is "+height);
	   System.out.println("age is "+age);
   }
   
   public void bark()
   {
	   System.out.println(name+"is very good dog"+"its height is"+height+age+"is its age");
   }
}
