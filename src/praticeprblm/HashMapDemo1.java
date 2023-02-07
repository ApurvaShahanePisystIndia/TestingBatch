package praticeprblm;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo1 {

public static void main(String arg[]) {
	HashMap<String,HashMap<String,Integer>>H3=new HashMap<String,HashMap<String,Integer>>();
	HashMap<String,Integer>H4=new HashMap<String,Integer>();
	
	
	
	
	Scanner scan=new Scanner(System.in);
	String name;
	int qty;
	int price;
	int N;
	System.out.println("enter a limit hashmap");
	N=scan.nextInt();
	for(int i=0;i<N;i++) {
		System.out.println("enter name");
		name=scan.next();
		System.out.println("enter qty");
		qty=scan.nextInt();
		System.out.println("enter price");
		price=scan.nextInt();
		H4.put("qty",qty);
		H4.put("price",price);
		//System.out.println(H4);
		H3.put(name,H4);
	}
		System.out.println(H3);
		String a;
		System.out.println("enter element remove");
		a=scan.next();
		H3.remove(a);
		System.out.println("After REmoving the Item ="+H3);
		String A;
		String B;
		int C;
		System.out.println("enter elment name replace");
		A=scan.next();
		System.out.println("what u want change");
		B=scan.next();
		System.out.println("enter updated a value");
		C=scan.nextInt();
		H3.get(A).put(B,C);
		System.out.println(H3);
		
	}
	
}