package ExceptionPratice;
import java.util.Scanner;
public class demo1
{
	public static void main(String[] args)
	  {
		Boolean playerOne=true;
		int computerchoice;
		int num=21;
		Scanner sc=new Scanner(System.in);
		System.out.println(".......................Rules....................");
		System.out.println(".........Only One Player Have to Play.......... ");
		System.out.println("..Player have to pick up stick between 1 and 4..");
		System.out.println("*************** Game started by player  ********");
		int playerchoice=0;
		while(num!=1) // that is the condition of the program to end on 1 that y 
		{
			if(playerOne==true)
			{
				System.out.print("Player choice=");
				playerchoice=sc.nextInt();
				System.out.println("\n");
				if(playerchoice >=1 && playerchoice<=4)
				{
				 num-=playerchoice;
				 System.out.println("After Player 1s turn Remaining sticks is ="+num);
				 System.out.println("\n");
				 playerOne=false;
			   }
				else
				{
				   System.out.println("Wrong choice of sticks");		   
			    }
				
			    } // if close 
			else
			{
				 computerchoice=5-playerchoice;
				 num-=computerchoice;
				 System.out.println("Computer choice is "+computerchoice);
				 System.out.println("After Computer's turn Remaining sticks is ="+num);
				 System.out.println("\n");
				 playerOne=true;
			}
		}
		System.out.print("As last stick is remaining and its player 1st Turn, Player 1 loses the game!");
		System.out.println(".....Game over....");
		
}// end of main 
}// end of class
