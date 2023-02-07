package praticeprblm;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class hashsettest1 
{
	
	
		HashMap<String,HashMap<String,Float>> Student=new HashMap<>();
		HashMap<String,Float> studentmarks;
		
		public void add()
		{
			float english,science,maths;
			int NumberOfStudent ;
			String studname;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Number of Student =");
			NumberOfStudent=sc.nextInt();
			for(int i=0;i<NumberOfStudent;i++)
		    {
				studentmarks=new HashMap<String,Float>(); // will create a new hashmap for every student 
				System.out.print("Enter the Name of Student =");
				studname=sc.next();
				System.out.print("Enter the marks of English = ");
				english=sc.nextFloat();
				System.out.print("Enter the marks of Science = ");
				science=sc.nextFloat();
				System.out.print("Enter the marks of maths = ");
				maths=sc.nextFloat();
				studentmarks. put("English",english);
				studentmarks.put("Science",science);
				studentmarks.put("Maths",maths);
				Student.put(studname,studentmarks);
			}
				System.out.println(Student);
		} // end of add function 
	
		public void update()
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("The Update Function Started ");
			String studname,studsubjectname;
			Float updatemarks;
			System.out.println("Enter the Student Name you want to Change");
			studname=sc.next();
			System.out.println("Enter the Subject name you want to Change");
			studsubjectname=sc.next();
			System.out.println("Enter the new marks");
			updatemarks=sc.nextFloat();
			Student.get(studname).put(studsubjectname, updatemarks); // get will get the inner hashmap values nd thn it will put the new value
			System.out.println("The Updated map="+studentmarks);
		}// end of update function
		public void view()
		{
		
			for(Map.Entry<String,HashMap<String,Float>> entry:Student.entrySet())
			{
				System.out.println("Key->"+entry.getKey()+"");
				for(Map.Entry<String,Float> marksentry:entry.getValue().entrySet())
				{
				System.out.print("  "+marksentry.getKey()+"   "+"value->"+marksentry.getValue());
				}
				System.out.println("\n");
			}
			
		} //end of update function
		public void remove()
		{
			String studname;
			Scanner sc=new Scanner(System.in);
			System.out.println("The Remove  Function Started ");
			System.out.println("Enter the Key You Want to  delete");
			studname=sc.next();
			Student.remove(studname); 
			for (Map.Entry<String,HashMap<String,Float>> m : Student.entrySet())
			{
		        System.out.println(m.getKey()+" "+ m.getValue());
		     }
			System.out.println(Student);
			
		}// end of update function
			public static void main(String args[])
			{
				hashsettest1 hashobj =new hashsettest1();
				Scanner scan1 = new Scanner(System.in);
				 int choice = 0;

				    System.out.println("\n");
			 while(choice != 6) 
			 {
				      System.out.println("1. Add ");
				      System.out.println("2. view ");
				      System.out.println("3. Update ");
				      System.out.println("4. remove ");
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
			            case 4:hashobj.remove();
							break;
			 } // end of switch 
			 } // end of while 
}// end of main 
} // end of class 
