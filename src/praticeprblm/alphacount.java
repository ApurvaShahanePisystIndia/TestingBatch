// First non repeating character karo
package praticeprblm;
import java.util.HashMap;
import java.util.Scanner;
public class alphacount
{
public static void main(String [] args)
{
	//Scanner sc=new Scanner(System.in);
	//String c;
	
	//System.out.print("Enter the sting you want to=");
	//c=sc.next();
	
	String c="apurvashahane";
	int count;
	char ch;
	HashMap<Character,Integer>countsofstring =new HashMap<Character,Integer>();
	for(int i=0; i<c.length();i++)
	{
		ch=c.charAt(i);
		if(countsofstring.containsKey(ch))
		{
			count=countsofstring.get(ch);
			count ++;
			countsofstring.replace(ch, count);
		}
		else
		{
			countsofstring.put(ch,1);
		}
	}
		for(Character key :countsofstring.keySet())
		{
			System.out.println(key   +" = "+countsofstring.get(key));
		}
}// endof main
}// end of class 
