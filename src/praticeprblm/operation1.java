package praticeprblm;

import java.util.Scanner;

class operation
{
	Scanner sc=new Scanner(System.in);
	String name;
	public void Accept()
	{
		System.out.println("Enter the name:");
		name=sc.next();
	}

}
class Add extends operation
{
	int a,b,c;
	public void Accept1()
	{
	System.out.println("Enter a:");
	a=sc.nextInt();
	System.out.println("Enter b:");
	b=sc.nextInt();
	c=a+b;
	System.out.println(c);
    }
}
class sub extends Add
{
	Scanner sc=new Scanner(System.in);
	String name;
		int d,e,f;
		public void Accept2()
		{
		System.out.println("Enter d:");
		d=sc.nextInt();
		System.out.println("Enter e:");
		e=sc.nextInt();
		f=d-e;
		System.out.println();
	    }

 public void display()
	 {
		 //System.out.println("Enter name:"+name);
		 System.out.println("Enter a:"+a);
		 System.out.println("Enter b:"+b);
		 System.out.println("Enter c:"+c);
		 System.out.println("Enter d:"+d);
		 System.out.println("Enter e:"+e);
		 System.out.println("Enter f:"+f);
		 
	 }
 }
class Div extends Add

{
		int g,h;
		float i;
		public void Accept3()
		{
		System.out.println("Enter g:");
		g=sc.nextInt();
		System.out.println("Enter :h");
		h=sc.nextInt();
		i=g/h;
		
	    }

public void display1()
{
	System.out.println("Enter g:"+g);
	 System.out.println("Enter h:"+h);
	 System.out.println("Enter i:"+i);
}
}
class Mul extends operation
{
	Scanner sc=new Scanner(System.in);
	String name;
	int m,n,o;
	public void Accept4()
	{
	System.out.println("Enter m :");
	m=sc.nextInt();
	System.out.println("Enter n:");
	n=sc.nextInt();
	o=m*n;
    }


public void display2()
{
	System.out.println("Enter m:"+m);
	 System.out.println("Enter n:"+n);
	 System.out.println("Enter o:"+o);
}
}


public class operation1 {
	public static void main(String args[])
	{
		Div d=new Div();
		d.Accept();
		d.Accept1();
		d.Accept3();
		d.display1();
		
		sub s=new sub();
		s.Accept();
		s.Accept1();
		s.Accept2();
		s.display();
		
}
}
