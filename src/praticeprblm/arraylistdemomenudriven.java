package praticeprblm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class arraylistdemomenudriven 
{
	ArrayList<ArrayList<String>> student=new ArrayList<ArrayList<String>>();
	ArrayList<String> student_info;
	Scanner scan1 = new Scanner(System.in);
	public void add()
	{
		int num;
		
		System.out.println("Enter the Number of Element you want to add =");
	    num=scan1.nextInt();
	    String eng,maths,sci;
		String studentname;
	    for(int i=0;i<num;i++)
	     {
	    	student_info=new ArrayList<String>(); 
	    	scan1 = new Scanner(System.in);
	    	 
	    	 System.out.print("Enter Name Of The Student ");
	    	 studentname=scan1.nextLine();
	    	 System.out.print("Enter the marks of English = ");
			 eng=scan1.nextLine();
			 System.out.print("Enter the marks of Science = ");
			 sci=scan1.nextLine();
			 System.out.print("Enter the marks of maths = ");
			 maths=scan1.nextLine();
	    	 student_info.add(studentname);
	    	 student_info.add(eng);
	    	 student_info.add(sci);
	    	 student_info.add(maths);
	    	 student.add(student_info);
	     }
	}
	public void view()
	{
		System.out.println("The view function started ");
	    
	    Iterator itr=student.iterator();//getting the Iterator  
	    while(itr.hasNext())
	    {  
	     System.out.println(itr.next());
	    }
	}
	public void update()
	{
		Scanner scan1 = new Scanner(System.in);
		 System.out.println("The Updated function started.......");
			scan1 = new Scanner(System.in);
		    String innerindexvalue,outerindexvalue,updatedmarks;
		    System.out.println("Enter the  Number of element position=");
		    innerindexvalue=scan1.nextLine();
		    System.out.println("Enter the position of the element =");
		    outerindexvalue=scan1.nextLine();
		    System.out.println("Enter Updated marks=");
		    updatedmarks=scan1.next();
		    student.get(Integer.parseInt(outerindexvalue)).set(Integer.parseInt(innerindexvalue),updatedmarks);	    
		    System.out.println("The updated list is ="+student);
	}
	public void max()
	{
		
		for(int i=0;i<student.size();i++)
		{
			int max=0;
			ArrayList<String> info=student.get(i);
			for(int j=1;j<info.size();j++)
			{
				if(max<Integer.parseInt(info.get(j)))
				{
					max=Integer.parseInt(info.get(j));
				}
			}
			System.out.println("Student "+info.get(0)+" has highest marks "+max);
		}
		
		
	}
	public void min()
	{
		for(int i=0;i<student.size();i++)
		{
			int min=100;
			ArrayList<String> info=student.get(i);
			for(int j=1;j<info.size();j++)
			{
				if(min>Integer.parseInt(info.get(j)))
				{
					min=Integer.parseInt(info.get(j));
				}
			}
			System.out.println("Student "+info.get(0)+" has Lowest marks "+min);
		}
		
	}
	
	
	
	public static void main(String args[])
	{
		arraylistdemomenudriven hashobj =new arraylistdemomenudriven();
		Scanner scan1 = new Scanner(System.in);
		 int choice = 0;

		    System.out.println("\n");
	 while(choice != 7) 
	 {
		      System.out.println("1. Add ");
		      System.out.println("2. view ");
		      System.out.println("3. Update ");
		      System.out.println("4. remove ");
		      System.out.println("5. Max ");
		      System.out.println("6. Min ");
		      System.out.println("Choose any one : ");
		      choice = scan1.nextInt();
		      System.out.println("You Have Selected "+choice);
		      System.out.print("\n");
		      switch(choice)
		      {
	            case 1 :hashobj.add();
	         			break;
	            case 2 :hashobj.view();
	 						break;
	            case 3 :hashobj.update();
					break;
	            case 5 : hashobj.max();
	            break;
	            case 6: hashobj.min();
	            break;
	            
		      }
	 }
		
	}
	
}
