package ExceptionPratice;
import java.util.Scanner;
public class gameof21sticks
{
	public static void main(String[] args)
	  {
		Boolean playerOne=true;                                                             
		Scanner sc=new Scanner(System.in);
		int computerchoice;
		int num=21;
		System.out.println("\n");
		
			System.out.println(".......................Rules....................");
			System.out.println(".........Only One Player Have to Player......... ");
			System.out.println("..Player have to pick up stick between 1 and 4.. ");
			System.out.println("*************** Game started by player  **************");
		int playerchoice=0;
		System.out.println("\n");
		while(num!=1)
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
			}
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
		
		
}// end of main 
}// end of class
