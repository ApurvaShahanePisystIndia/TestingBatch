   package praticeprblm;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class hashmaptest2 
{
	HashMap<String,HashMap<String,Float>> Student=new HashMap<>();
	HashMap<String,Float> marks;
	Scanner sc=new Scanner(System.in);
	public void add()
	{
		int num;
		String studname;
		Float english,maths,science;
		//Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Student you want to add=");
		num=sc.nextInt();
		for(int i=0;i<num;i++)
	    {
			marks=new HashMap<String,Float>(); 
		System.out.println("Enter the name of the name =");
		studname=sc.next();
		System.out.println("Enter your English Marks=");
		english=sc.nextFloat();
		System.out.println("Enter your Maths Marks=");
		maths=sc.nextFloat();
		System.out.println("Enter your Science Marks=");
		science=sc.nextFloat();
		marks. put("English",english);
		marks.put("Maths",maths);
		marks.put("Science",science);
		Student.put(studname, marks);
	    }
		System.out.print("\n");
		}// end of  add  
	public void update()
	{
		String studname,subname;
		Float newmarks;
		
		//Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Name whoes values you want to change=");
		studname=sc.next();
		System.out.print("Enter The Subjects Name you have to change");
		subname=sc.next();
		System.out.print("Enter The New Marks=");
		newmarks=sc.nextFloat();
		Student.get(studname).put(subname, newmarks); // get will get the inner hashmap values nd thn it will put the new value
		System.out.println("The Updated map="+marks);
		System.out.println("The Updated map="+Student);
		}//end of update method
	
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
		}//end of for loop of view method
	}//end of view method
	
	public void remove()
	{
		String studname;
		//Scanner sc=new Scanner(System.in);
		System.out.println("The Remove  Function Started ");
		System.out.println("Enter the Key You Want to  delete");
		studname=sc.next();
		Student.remove(studname); 
		for (Map.Entry<String,HashMap<String,Float>> m : Student.entrySet())
		{
	        System.out.println(m.getKey()+" "+ m.getValue());
	     }
		System.out.println(Student);
	}//End of Remove method
	
	
	public static void main(String args[])
	{
		hashmaptest2 hmt2=new hashmaptest2();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		while(choice<= 4)
		{
			System.out.println("1 Add");
			System.out.println("2 Update");
			System.out.println("3 View");
			System.out.println("4 Remove");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			System.out.println("Your Choice is ="+choice);
			switch(choice)
			{
			case 1:hmt2.add();break;
			case 2: hmt2.update();break;
			case 3: hmt2.view();break;
			case 4:hmt2.remove();break;
			}// End of switch
			
		 } // End While	
}//End of main
} // end of class