package ExceptionPratice;
import java.util.Scanner;
public class stick21
{
	public static void main(String[] args)
	  {
		Boolean playerOne=true;
		int computerchoice;
		int num=21;
		int playerchoice=0;
		Scanner sc=new Scanner(System.in);
		while(num!=1)
		{
			if(playerOne==true)
			{
				System.out.print("Player choice=");
				playerchoice=sc.nextInt();
				if(playerchoice >=1 && playerchoice<= 4)
				{
					num-=playerchoice;
					 System.out.println("After Player 1s turn Remaining sticks is ="+num);
					 System.out.println("\n");
					 playerOne=false;
				}
				else
				{
					System.out.println("Wrong Choice");
					
				}
			}
			else
			{
				computerchoice=5-playerchoice;
				num-=computerchoice;
				System.out.println("Computer choice is "+computerchoice);
				System.out.println("After Computer's turn Remaining sticks is ="+num);
				playerOne=true;
			}
		}
		System.out.print("As last stick is remaining and its player 1st Turn, Player 1 loses the game!");
}// end of main 
}// end of class
