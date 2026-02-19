import java.util.Scanner;

public class BTLS {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many bottles of beer?");
		int nbtls = input.nextInt();
		for (int i = nbtls; i >= 0; i--) {
			bottlesOfBeer(i, nbtls);
		}

	}

	private static void bottlesOfBeer(int i, int nbtls) {
		if (i == 2) {
			System.out.println(i + " bottles of beer on the wall, " + i + " of beer, take one down pass it around "
					+ (i - 1) + " bottle of beer.");
		} else if (i == 1) {
			System.out.println(i + " bottles of beer on the wall, " + i + " of beer, take one down pass it around "
					+ (i - 1) + " bottle of beer.");
		} else if (i == 0) {
			System.out.println(i + " bottles of beer on the wall, " + i + " of beer, take one down pass it around "
					+ nbtls + " bottle of beer.");

		}
		else 
		{
			System.out.println(i + " bottles of beer on the wall, " + i + " of beer, take one down pass it around "
					+ (i - 1) + " bottles of beer.");
		}

	}

}
