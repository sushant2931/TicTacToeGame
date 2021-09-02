package bl.com.tictactoe;

public class TicTacToeGame {
	private static char[] element;

	public static void main(String[] args) {

		// Displaying TicTacTae Game Welcome Message
		System.out.println("*------Welcome to Tic Tac Toe Game------*");
		// for creating empty elements
		boardCreation();
	}

	/*
	 * creating elements with null 0th index ignored for user friendly
	 * 
	 * @param element
	 */
	private static void boardCreation() {
		element = new char[10];
		for (int i = 1; i < 10; i++) {
			element[i] = ' ';
		}
		System.out.println("Empty board created");
	}
}