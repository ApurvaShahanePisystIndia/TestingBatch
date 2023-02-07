package Vivek_sir;

import java.util.HashMap;

public class Hashmap {
	
	
	public static void main(String args[])
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Tata");
		map.put(2,"Toyota");
		map.put(3,"Mahindra");
		map.put(4,"Maruti");
		map.put(5,"ford");
		
	System.out.println(map);
map.remove(1);
System.out.println(map);
System.out.println("The Length="+map.size());
if(map.containsKey(2))
{
	String a;
	a=map.get(2);
System.out.println(a);
}
System.out.println("ford="+map.get(5));
	}
}

