package snake_ladder;

public class Snake_Ladder {
	

	public static void main(String[] args) {
		System.out.println("Snake and Ladder game played with single player at start position 0");
		int die = (int) ((Math.floor(Math.random() * 10)) % 6) + 1;
		System.out.println("Rolling the die gives : " + die);
	}
	
}
