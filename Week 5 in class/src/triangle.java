import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public abstract class triangle {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
	/**
	 * Write a program (class name RightAngleLoop) to accept a number from the user and display 
	 * the pattern like right angle triangle with a number like the picture shown here.  
	 * You should define and invoke a method called getUserNumber()  to get the number from the user.
	 */
		System.out.println("symbols to print");
		char symb = input.next().charAt(0);
		int num = getUserNum();
		buildRtTriangle(num);
		buildEqTriangle(num, symb);
	}
	private static void buildEqTriangle(int num, char symb) {
		for (int i = 0; i <= num; i++) {
			for(int k = i; k < num; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(symb + " ");
			}
				System.out.println();
			}
				
			
			}
			
			
	private static void buildRtTriangle(int num) {
		for (int i = 0; i <= num; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		
	}

	private static int getUserNum() {
		System.out.println("How many floors will your triangle be?");
		int num = input.nextInt();
		return num;
	}

}
