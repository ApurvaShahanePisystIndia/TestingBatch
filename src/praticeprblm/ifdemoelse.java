package praticeprblm;
import java.util.*;

public class ifdemoelse {

	public static void main(String[] args) {
		int num,age;
		String name,gender;
		Date date;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of the Person =");
		name=sc.next();
		System.out.println("Enter the Gender =");
		gender=sc.next();
		System.out.println("Enter the Age =");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("You are eligible ");
		}
		
		else
		{
			System.out.println("You are  not eligible !!!!!!!");
		}
		
	// Program 2 to see wheather a person is elegible for marriage
		System.out.println("Enter the number =");
		num=sc.nextInt();
		System.out.println("Enter the Name of the Person =");
		name=sc.next();
		System.out.println("Enter the Gender =");
		gender=sc.next();
		System.out.println("Enter the Age =");
		age=sc.nextInt();
		System.out.println("Enter the Date of Birth  =");
		date=sc.next();
		if(gender==male && age>=21 && gender==female && age>=18 )
		{
			System.out.println("You are eligible");
			
		}
		else()
		{
			System.out.println("You are not eligible");
		}
	}

}
