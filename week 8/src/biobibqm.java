import java.util.Scanner;

public class biobibqm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		countdown(3);
		int ans = factorial(25);
		System.out.println(ans);
		int num = input.nextInt();
		System.out.println("How far in the fibbonacci do you wanna go?");
		for (int i = 0; i < num; i++) {
			System.out.print(fibbonacci(i) + ", ");
		}
		System.out.println(" what number do you wish to convert to binary?");
		num = input.nextInt();
		displayBin(num);
	
	}

	private static void displayBin(int num) {
		if(num > 0) {
			displayBin(num / 2);
			System.out.print(num % 2);
		}
		
	}

	private static int fibbonacci(int i) {
		if (i == 0)
			return 0;
		else if (i == 1 || i == 2) return 1;
		
		return fibbonacci(i - 1) + fibbonacci(i - 2);
	}

	private static int factorial(int n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1);

	}

	private static void countdown(int i) {
		if (i == 0) {
			System.out.println("Blast off!");
		} else {
			System.out.println(i);
			countdown(i - 1);
		}

	}

}
