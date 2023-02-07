package Vivek_sir;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
	Scanner Sc = new Scanner(System.in);
	public void add() {
		String a;
		ArrayList<String> a1=new ArrayList<String>();
		System.out.println("Enter the element you want to add");
		a=Sc.next();
		a1.add(a);
		System.out.println("After thr method end= "+a1);
	}
	//public void remove() {
		
	//}
	public static void main(String[] args) {
	ArrayList1 L1 = new ArrayList1();
	L1.add();

	}

}
