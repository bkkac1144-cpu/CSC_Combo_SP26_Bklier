import java.util.Arrays;
import java.util.Scanner;

/**************************************************
 * This is a Tic Tac Toe game created with code. * It will need a player
 * variable and a board. * the player variable will be an int that * alternates
 * between 1 and 2 * the board will ba an array of characters * *
 * 
 * @author Benjamin Klier *
 * @date 3/4/2026 * *
 *************************************************/

public class tic_tac_toe {

	public static void main(String[] args) {
		int player = 2;
		char[] board = new char[9];
		fillboard(board);
		drawBoard(board);
		int count = 0;
		while (count < 9 && checkWinner(board, player) < 0) {
			player = player % 2 + 1;
			makeMove(board, player);
			drawBoard(board);
			count++;
		}
		if (checkWinner(board, player) > 0)
			System.out.println("player " + player + " is the winner");
		else
			System.out.println("Cat's game");
	}

	private static int checkWinner(char[] board, int player) {
		String line = "";
		for (int i = 0; i < 8; i++) {
			switch (i) {
			case 0:
				line = String.valueOf(board[0]) + board[1] + board[2];
				break;
			case 1:
				line = String.valueOf(board[3]) + board[4] + board[5];
				break;
			case 2:
				line = String.valueOf(board[6]) + board[7] + board[8];
				break;
			case 3:
				line = String.valueOf(board[0]) + board[3] + board[6];
				break;
			case 4:
				line = String.valueOf(board[0]) + board[3] + board[6];
				break;
			case 5:
				line = String.valueOf(board[1]) + board[4] + board[7];
				break;
			case 6:
				line = String.valueOf(board[2]) + board[5] + board[8];
				break;
			case 7:
				line = String.valueOf(board[0]) + board[4] + board[8];
				break;
			case 8:
				line = String.valueOf(board[2]) + board[4] + board[6];
				break;
			}
			System.out.println(line);
			if (line.equals("XXX") || line.equals("OOO"))
				return player;
		}

		return -1;
	}

	private static void makeMove(char[] board, int player) {
		Scanner input = new Scanner(System.in);
		char marker = 'X';
		if (player == 2)
			marker = 'O';

		int place = -1;
		while (place < 1 || place > 9) { // Forces them to choose a number in bounds
			System.out.println("Player " + player + " enter the number of where you want a marker");
			place = input.nextInt();
		}
		while (!Character.isDigit(board[place - 1]))// Makes sure spot is not used
		{
			System.out.println("Player " + player + " enter the number of where you want a marker");
			place = input.nextInt();
		}

		board[place - 1] = marker;
		// input.close();
	}

	private static void drawBoard(char[] board) {
		int index = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) { // cols
				System.out.print(board[index]);
				if (j != 2)
					System.out.print('|');
				index++;
			}
			System.out.println();
			if (i != 2)
				System.out.println("~~~~~");
		}

	}

	private static void fillboard(char[] board) {
		int index = 0;
		for (char i = '1'; i <= '9'; i++) {
			board[index] = i;
			index++;
		}

	}

}
