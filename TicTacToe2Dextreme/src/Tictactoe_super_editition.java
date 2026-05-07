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

public class Tictactoe_super_editition {

	public static void main(String[] args) {
		int player = 2;
		char[][] board = new char[3][3];
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

	private static int checkWinner(char[][] board, int player) {
		String line = "";
		for (int i = 0; i < 8; i++) {
			switch (i) {
			case 0:
				line = String.valueOf(board[0][0]) + board[0][1] + board[0][2];
				break;
			case 1:
				line = String.valueOf(board[1][0]) + board[1][1] + board[1][2];
				break;
			case 2:
				line = String.valueOf(board[2][0]) + board[2][1] + board[2][2];
				break;
			case 3:
				line = String.valueOf(board[0][0]) + board[1][0] + board[2][0];
				break;
			case 4:
				line = String.valueOf(board[1][0]) + board[1][1] + board[1][2];
				break;
			case 5:
				line = String.valueOf(board[2][0]) + board[2][1] + board[2][2];
				break;
			case 6:
				line = String.valueOf(board[0][0]) + board[1][1] + board[2][2];
				break;
			case 7:
				line = String.valueOf(board[2][0]) + board[1][1] + board[1][2];
				break;
		
			}
			//System.out.println(line);
			if (line.equals("XXX") || line.equals("OOO"))
				return player;
		}

		return -1;
	}

//	private static void makeMove(char[][] board, int player) {
//		Scanner input = new Scanner(System.in);
//		int row = -1;
//		int col = -1;
//		char marker = (player == 1) ? 'x' : 'o';
//	
//
//		int place = -1;
//		while (place < 1 || place > 9) { // Forces them to choose a number in bounds
//			System.out.println("Player " + player + " enter the number of where you want a marker");
//			place = input.nextInt();
//			
//		}
//		switch(place) {
//		case 1:
//			row = 0;
//			col = 0;
//			break;
//		case 2:
//			row =0;
//			col = 1;
//			break;
//		case 3:
//			row =0;
//			col = 2;
//			break;
//		case 4:
//			row =1;
//			col = 0;
//			break;
//		case 5:
//			row = 1;
//			col = 1;
//			break;
//		case 6:
//			row =1;
//			col = 2;
//			break;
//		case 7:
//			row =2;
//			col = 0;
//			break;
//		case 8:
//			row =2;
//			col = 1;
//			break;
//		case 9:
//			row =2;
//			col =2;
//			break;
//
	// }
	private static void makeMove(char[][] board, int player) {
		Scanner input = new Scanner(System.in);
		int row, col, place;
		char marker = (player == 1) ? 'X' : 'O';
		while (true)// Makes sure spot is not used
		{
			System.out.println("Player " + player + " enter the number of where you want a marker");
			if (input.hasNextInt()) {
				place = input.nextInt();
				if (place >= 1 && place <= 9) {
					row = (place - 1) / 3;
					col = (place - 1) % 3;
					if (Character.isDigit(board[row][col])) {
						board[row][col] = marker;
						break;
					} else {
						System.out.println("that spot's taken already!");
					}
				} else {
					System.out.println("Invalid range. please pick within 1-9");
					input.next(); // Clear invalid input
				}
			}
		}

	}

	private static void drawBoard(char[][] board) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) { // cols
				System.out.print(board[i][j]);
				if (j != 2)
					System.out.print('|');

			}
			System.out.println();
			if (i != 2)
				System.out.println("~~~~~");
		}

	}

	private static void fillboard(char[][] board) {
		char ch = '1';
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				board[i][j] = ch;
				ch++;
			}
		}

	}

}
