package praticeprblm;

import java.awt.Choice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo1 {
	
	ArrayList<Integer> obj=new ArrayList<Integer>();
	static Scanner sc=new Scanner(System.in);
	
	public void add() 
	{
		int n;
		System.out.println("Enter the Limit = ");
		n=sc.nextInt();
		for (int i=0; i<n;i++)  // n=4
		{
			System.out.println("Enter Value");
			int a=sc.nextInt();
			obj.add(a);
		}
		System.out.println(obj); /// print the list
	}
	public void remove()
	{
		System.out.println("Enter the number of element you want to remove");
		int m=sc.nextInt();
		
		for(int i=0;i<m;i++)
		{
			System.out.println("Enter the index for removable Element");
			int b=sc.nextInt();
			obj.remove(b);
		}
		System.out.println(obj);
	}

	public void sort()
	{
		Collections.sort(obj);
		System.out.println("After sorting :"+obj);
	}
	public void view ()
	{
		System.out.println("values :"+obj);
	}

	public static void main(String[] args)
	{
		ArrayListDemo1 obj =new ArrayListDemo1();
		/*obj.add();
		obj.remove();
		obj.sort();
		obj.view();*/
		int Choice=0;
		
		//Choice=sc.nextInt();
		
		while(Choice !=4 )
		{
			System.out.println("1 add");
			System.out.println("2 remove");
			System.out.println("3 Sort");
			System.out.println("4 view");
			System.out.println("Enter your Choice");
			Choice=sc.nextInt();
			System.out.println("Your choice is");
			switch(Choice)
			{
				case 1:obj.add();break;
				case 2:obj.remove();break;
				case 3:obj.sort();break;
				case 4:obj.view();break;
				
			}
		}
	}

}