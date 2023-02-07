package praticeprblm;

import java.util.Scanner;

class shape1
{
	String name;
	
	Scanner sc=new Scanner(System.in);
	 public void Accept()
	 {
		 System.out.println("Enter the name:");
			name=sc.next();
	 }
}
class circle extends shape1
{
	float pi=3.14f, Area,cur;
	int R;
	
	public void Accept1()
	{ 
		System.out.println("Enter the Radius:");
	      R=sc.nextInt();
	}
	public void Area()
	{ 
		Area = pi*R*R;	
		
	 
	}
	
}
class square extends circle
{
	int B, Square,areas;

	public void Accept2()
	{ 
		System.out.println("Enter the side:");
	     B=sc.nextInt();
	}
	public void cur()
	{ 
		
		areas = 4*B;
	}

	public void display()
	{
		System.out.println(name);
		System.out.println("radius="+R);
		System.out.println("pi="+pi);
		System.out.println("The Area of circle:"+Area);
		System.out.println("side is ="+B);
		System.out.println("Enter the Area of square:"+areas);
			
	}
}
	

public class multilevel
{

	
	public static void main(String args[])
	{
	square s=new square();
	 s.Accept();
	 s.Accept1();
	 s.Accept2();
	 s.Area();
	 s.cur();
	 
	 s.display();
	 
	}

}
