package ExceptionPratice;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayListDemo {
	public static void main(String args[])
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		// Blank List is created 
		
		//Element Add
		a1.add(1);
		a1.add(5);
		a1.add(1);
		a1.add(4);
		a1.add(3);
		a1.add(2);
		
		 
		System.out.println("Element in the list"+a1);
		
		//To Remove the Element
		a1.remove(2);  //Index nos is used to remove the element 
		System.out.println("After Removing Element "+a1);
		
		//To Update the Element
		a1.set(1,0);
		System.out.println("After Update Element "+a1);
		
		
		// To Sort the element 
		Collections.sort(a1);
		System.out.println("After Sort Element "+a1);
		
		
	}
}
