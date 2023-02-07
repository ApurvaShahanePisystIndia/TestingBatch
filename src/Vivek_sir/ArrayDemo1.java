package Vivek_sir;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayDemo1 {
	Scanner Sc = new Scanner(System.in);
	ArrayList<String> a2=new ArrayList<String>();
	public void accept() {
		String a1;
		int n;
		System.out.println("Enter How Many bike name");
		n=Sc.nextInt();
		for(int i=0;i<n;i++) {
				
			System.out.println("Enter the bike name");
			a1=Sc.next();
			a2.add(a1);
		}
		System.out.println(a2);
	}
	public void remove()
	{
		String b;
		System.out.println("Enter the bike name you want to remove ");
		b=Sc.next();
		a2.remove(b);
		System.out.println("After REmove= "+a2);
		}
		public static void main(String[] args) {
		ArrayDemo1 d1 = new ArrayDemo1();
		d1.accept();
		d1.remove();
	}
}