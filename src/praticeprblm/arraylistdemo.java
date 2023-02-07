package praticeprblm;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylistdemo 
{
	//=new ArrayList<Object>();
	public static void main(String args[]) 
	{
		ArrayList<ArrayList<String>> student=new ArrayList<ArrayList<String>>();
		ArrayList<String> student_info;
		
		int num;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the Number of Element you want to add =");
	    num=scan1.nextInt();
	    String eng,maths,sci;
		String studentname;
	    for(int i=0;i<num;i++)
         {
	    	scan1 = new Scanner(System.in);
	    	 student_info = new ArrayList<>();
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
        } // closing of for 
	    System.out.println("The Content of the list is="+student);
	    
	  /*  System.out.println("The Updated function started.......");
	   
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
	    */
	    System.out.println("The View function Started.............");
	    Iterator itr = student.iterator();//getting the Iterator  
	    while(itr.hasNext())
	    {  
	     System.out.println("In Loop"+itr.next());
	    }
	    
	    
	    
	    
	    
	    } // closing of main function
} // closing of class

