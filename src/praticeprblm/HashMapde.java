package praticeprblm;

import java.util.*;

public class HashMapde {

	public static void main(String[] args) {
		
	
		
		
		
		HashMap<String,HashMap<String,Integer>> StudentName= new HashMap<String,HashMap<String,Integer>>();
		
		HashMap<String,Integer> StudentInfo =new HashMap<String,Integer>();
		
		StudentInfo.put("English",45);
		StudentInfo.put("Maths",50);
		StudentName.put("Apurva",StudentInfo);
		System.out.println("The List is ="+StudentName);
		
		
		 Iterator it = StudentInfo.iterator();
		while(it.hasNext()) {
		     String i = it.Next();
		       {
		        it.remove();
		      }
		
		
	
		
	}

}
/*	HashMap<String,Integer> m1 =new HashMap<String,Integer>();
m1.put("Rice", 1);
m1.put("Oil",2);
System.out.println(m1);
HashMap<Integer,String> m2 = new HashMap<Integer,String>();
m2.put(1, "Rice");
m2.put(2, "null");
System.out.println(m2);*/