package Vivek_sir;
abstract class Operation
{
	abstract void add(int a,int b);
	
}
 class Add extends Operation
{
	int c;
	public void add(int a,int b)
	{
		c=a+b;
		System.out.println(c);
	}
}
class Mul extends Operation
{
 int d;
 public void add(int a,int b)
 {
	 d=a*b;
	 System.out.println(d);
 }
}
class Div extends Operation
{
	int e;
	public void add(int a,int b)
	{
		e=a/b;
		System.out.println(e);
	}
}

	









public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Add a=new Add();
a.add(5,5);
Mul s=new Mul();

s.add(2,4);
Div d=new Div();
d.add(100, 02);

	}

}



















