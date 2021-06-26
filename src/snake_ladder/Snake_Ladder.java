package snake_ladder;

public class Snake_Ladder 
{
	public static final int noPlay = 0;
	public static final int ladder = 1;
	public static final int snake = 2;

	//User check for a option
	public static void checkOptions() {
		int player_position = 0;
		int die = (int) ((Math.floor(Math.random() * 10)) % 6) + 1;
		int check_options = (int) ((Math.floor(Math.random() * 10)) % 3);
		switch (check_options) {
		case noPlay:
			player_position += 0;
			System.out.println("Sorry! No-Play Stay At "+player_position);
			break;
		case ladder:
			player_position += die;
			System.out.println("Hurray! Ladder Climb Go To "+player_position+ " Position.");
			break;
		case snake:
			player_position -= die;
			System.out.println("Oops! Snake Bite Go To "+player_position+" Position.");
			break;
		}

	}
	

	public static void main(String[] args) 
	{
		System.out.println("Snake and Ladder game played with single player at start position 0");
		int die = (int) ((Math.floor(Math.random() * 10)) % 6) + 1;
		System.out.println("Rolling the die gives : " + die);
		checkOptions();
	}
	
}
