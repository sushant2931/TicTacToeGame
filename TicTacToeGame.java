package bl.com.tictactoe;

import java.util.*;

public class TicTacToeGame {
	private static char[] element;
	static char userMark, computerMark;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Displaying TicTacTae Game Welcome Message
		System.out.println("*------Welcome to Tic Tac Toe Game------*");
		// for creating empty elements
		boardCreation();
		// for user to choose 'X' or 'O' mark
		choosingXorO();
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
	}

	/*
	 * Asking user to choose X or O
	 * 
	 * @param option
	 * 
	 * @return userMark, computerMark
	 */

	private static void choosingXorO() {
		System.out.println("Choose 1 for 'X' or Choose 2 for 'O' as your mark");
		int option = scan.nextInt();
		switch (option) {
		case 1:
			userMark = 'X';
			computerMark = 'O';
			break;
		case 2:
			userMark = 'O';
			computerMark = 'X';
			break;
		default:
			System.out.println("Your input is invalid");
			choosingXorO();
		}
	}
}
