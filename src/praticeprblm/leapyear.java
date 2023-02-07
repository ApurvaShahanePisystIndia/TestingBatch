package praticeprblm;
import java.util.*;
public class leapyear
{
int year;
Scanner dj= new Scanner(System.in);
public void leap()
{
System.out.println("enter the leap year");
year=dj.nextInt();

}
public void dis()
{
	System.out.println("enter the leap year"+year);
if (year %4==0)	
{
	System.out.println(" the year is leap");	

}
else
{
	System.out.println("this is not leap year");
}
}
public static void main(String args[])
{
leapyear n= new leapyear();
n.leap();
n.dis();
	

	
}
}
