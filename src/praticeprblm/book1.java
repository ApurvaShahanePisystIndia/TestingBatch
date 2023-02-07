package praticeprblm;

import java.util.Scanner;

class book
{
	String name;
	Scanner sc=new Scanner(System.in);
	
	public void Accept()
	{
		System.out.println("Enter the name:");
		name=sc.next();
	}
}
class offline extends book
{
	int pages , price;
	int m;
	public void Accept1()
	{
		
		System.out.println("Enter the price:");
		price=sc.nextInt();	
		System.out.println("Enter the pages:");
		pages=sc.nextInt();	
	}
	public void count()
	{
		if (m>=55 && m<=99)
		{
			System.out.println("Good *****");
		}
		else if(m>=100 && m<=450)
		{
			System.out.println("Better **");
		}
		else if(m<=500)
		{
			System.out.println("Worst *");
		}
		else 
		{
			System.out.println("Bed Choice");
		}
	}
	
	
	public void display()
	{
		System.out.println(name);
		System.out.println(price);
		System.out.println(pages);
	}
	
}


public class book1
{
	public static void main(String[] args) {
	offline a=new offline();
	a.Accept();
	a.Accept1();
	a.display();
	a.count();

	}

}
