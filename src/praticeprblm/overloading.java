package praticeprblm;

import java.util.Scanner;

class shape
{
	String name;
	Scanner sc=new Scanner(System.in);
	
	public void Accept()
	{
		System.out.println("Enter the name:");
		name=sc.next();
	}
}
class Rectangle extends shape
{
	int length,Breadth,s;
	
	public void Accept1()
	{
		System.out.println("Enter the length:");
		length=sc.nextInt();
		System.out.println("Enter the Breadth:");
		Breadth=sc.nextInt();	
	}
	
	public void Area()
	{
		s=length*Breadth;
		
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(length);
		System.out.println(Breadth);
		System.out.println(s);
	
	}
	
}

public class overloading 
{
    public static void main(String args[])
{
	Rectangle R1=new Rectangle();
	R1.Accept();
	R1.Accept1();
	R1.Area();
	R1.display();
}
}
