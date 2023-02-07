package Vivek_sir;
abstract class Animal
{
	 abstract void sound();//declare
	 public void frnds()//
	 {
		 System.out.println("Welcome");
	 }
}
 class AbstractDemo1 extends Animal{
	 
	public void sound()//define
	{
		System.out.println("Hello");
		
	}
 }
 public class AbstractDemo 
 {
	 
	public static void main(String args[])
	{
		AbstractDemo1 a1= new AbstractDemo1();
		a1.sound();
		a1.frnds();
	}

}
