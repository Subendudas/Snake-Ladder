package snake_ladder;

public class Snake_Ladder 
{
	public static final int noPlay = 0;
	public static final int ladder = 1;
	public static final int snake = 2;
	public static final int winning = 100;

	//User check for a option
	public static void checkOptions() 
	{
		int counter = 0;
		int player_position_player1 = 0;
		int player_position_player2 = 0;
		//int player_position = 0;
		//while (player_position < winning) it was for only player.
		while ((player_position_player1 < winning) || (player_position_player2 < winning))//Two Player Case.
		{
		int die = (int) ((Math.floor(Math.random() * 10)) % 6) + 1;
		int check_options = (int) ((Math.floor(Math.random() * 10)) % 3);
		switch (check_options) 
		{
		//Player 1.
		case noPlay:
			player_position_player1 += 0;
			System.out.println("Player One Sorry! No-Play Stay At "+player_position_player1+" Player One is at "+player_position_player1);
			
			break;
		case ladder:
			player_position_player1 += die;
		if (player_position_player1 > 100) 
			{
				player_position_player1 -= die;
					System.out.println("Player One Stay At Previous "+player_position_player1+"th Position Because You Went Ahead 100th Position.");
			} 
		else 
			{
				
				System.out.println("Player One Hurray! Ladder Climb Go "+player_position_player1+ " Position Up.");
		if (player_position_player1 == 100) 
				{
					System.out.println("Player One Wins");
					System.exit(1);
			    }
			}
		break;
		case snake:
			player_position_player1 -= die;
		if (player_position_player1 < 0)
			{
					player_position_player1 = 0;
					System.out.println("Player One You Went Below 0 So You Need To Restart The Game From "+player_position_player1+"th Position.");
			}
  	   else 
			{
					System.out.println("Player One Oops! Snake Bite Go "+player_position_player1+" Position Down.");
			}
       break;
		}
		
		//Player 2
	      die = (int) ((Math.floor(Math.random() * 10)) % 6) + 1;
	      check_options = (int) ((Math.floor(Math.random() * 10)) % 3);
	  switch (check_options) 
	{
	  case noPlay:
		
		 player_position_player2 += 0;
		 System.out.println("Player Two Sorry! No-Play Stay At "+player_position_player2+" Player One is at "+player_position_player2);
	  break;
	  
	case ladder:
		
		 player_position_player2 += die;
	if (player_position_player2 > 100) 
	{
			player_position_player2 -= die;
			      System.out.println("Player Two Stay At Previous "+player_position_player2+"th Position Because You Went Ahead 100th Position.");
		} 
	else 
		{
			System.out.println("Player Two Hurray! Ladder Climb Go "+player_position_player2+ " Position Up.");
	if (player_position_player2 == 100) 
	        {
				System.out.println("Player Two Wins");
				System.exit(1);
			}
		}
		break;
	case snake:
		player_position_player2 -= die;
		if (player_position_player2 < 0) 
		{
			player_position_player2 = 0;
			System.out.println("Player Two You Went Below 0 So You Need To Restart The Game From "+player_position_player2+"th Position.");
		} 
		else 
		{
			System.out.println("Player Two Oops! Snake Bite Go "+player_position_player2+" Position Down.");
		}
		break;
	}
	counter++;
	System.out.println("Number of time Dice Thrown: "+counter);
 }

}

	

	public static void main(String[] args) 
	{
		System.out.println("Snake and Ladder game played with single player at start position 0");
		//int die = (int) ((Math.floor(Math.random() * 10)) % 6) + 1;
		//System.out.println("Rolling the die gives : " + die); 
		checkOptions();
	}
	
}
