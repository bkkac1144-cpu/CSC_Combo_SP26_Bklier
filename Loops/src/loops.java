import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		// while loop
		int n = 3; // initializer
		while (n > 0)// condition
		{
			System.out.println(n);
			n--;
		}
		System.out.println("Blast off");

		n = 10;
		while (n != 1) {
			System.out.println(n);
			if (n % 2 == 0)// n is even modulo division (remainder)
			{
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
		}
		n = 0;
			while (n <= 8) {
				System.out.print(n + ", ");
				n += 2; // counting by 2's
			}
			System.out.println("Who do we appreciate?");

		// for loops
		for (int i = 0; i <= 8; i += 2) {
			System.out.print(i + ", ");
		}
		System.out.print("Who do we appreciate?");
		
		for(int i = 3; i > 0; i--)
		{
			System.out.println(i);
		}
		System.out.println("Blast-off!!");
		
		for (int rows = 1; rows <= 10; rows++) {
			for (int cols = 0; cols <= 10; cols++) {
				System.out.printf("%5d", rows * cols);
			}
			System.out.println();
		}
		System.out.print("Roman alphabet: ");
		for(char c = 'A';c <= 'z'; c++)
		{
			System.out.print(c);
		}
		System.out.print("Greek Alphabet");
		for (int i = 913; i <= 937; i++) {
			System.out.print((char) i);
		}
	}
}
