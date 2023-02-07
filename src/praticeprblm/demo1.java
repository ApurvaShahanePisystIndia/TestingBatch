package praticeprblm;

import java.util.Date;
import java.util.Scanner;
class mode
{
	String name;
	int price;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter the name ");
		name=sc.next();
		System.out.println("Enter the price ");
		price=sc.nextInt();
		
	}
}
class online extends mode
{
	String url,author,oname;
	String publish_Date;
	
	public void accept1()
	{
		System.out.println("Enter the name");
		oname=sc.next();
		System.out.println("Enter the url");
		url=sc.next();
		System.out.println("Enter the author");
		author=sc.next();
		System.out.println("Enter the Date ");
		publish_Date=sc.next();
	
	}
	public void display()
	{
		System.out.println("Enter the name "+name);
		System.out.println("Enter the Price = "+price);
		System.out.println("Enter the Mode name = "+oname);
		System.out.println("Enter the url =  "+url);
		System.out.println("Enter the Author  = "+author);
		System.out.println("Enter the Date = "+publish_Date);
	}
	
}
class offline1 extends mode
{
	String offname;
	int salesprice,no_of_piece;
	public void accept3()
	{
		System.out.println("Enter the name of the mode");
		offname=sc.next();
		System.out.println("Enter the sales price");
		salesprice=sc.nextInt();
		System.out.println("Enter the qty ");
		no_of_piece=sc.nextInt();
		
	}
	
}
class booksdemo extends offline1
{
	String location,type;
	public void accept4()
	{
		System.out.println("Enter the Location ");
		location=sc.next();
		System.out.println("Enter the Type = ");
		type=sc.next();
		
		
	}
	public void calculate()
	{
		if(price<salesprice)
		{
			System.out.println("IT is profit");
		}
		else
			System.out.println("It is loss");
	}
	public void display2()
	{
		System.out.println("Enter the Name = "+offname);
		System.out.println("The qty = "+no_of_piece);
		System.out.println("Location = "+location);
		System.out.println("Type = "+type);
		System.out.println("The price is ="+price);
		System.out.println("The Sales price = "+salesprice);
		
		
	}
	
	
}

public class demo1 {
	public static void main(String args[])
	{
		online o= new online();
		o.accept();
		o.accept1();
		o.display();
		
		booksdemo d=new booksdemo();
		d.accept();
		d.accept3();
		d.accept4();
		d.display2();
		d.calculate();
		
	}

}

















