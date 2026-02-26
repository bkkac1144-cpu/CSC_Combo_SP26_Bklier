import java.util.Scanner;

public class scrabble {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.next();
		String lWord = word.toLowerCase();
		String tiles = "qujibo";
		System.out.println(canSpell(word, tiles));

	}

	private static boolean canSpell(String word, String tiles) {

		int wordCount = 0;
		int tileCount = 0;
		for (int i = 0; i < word.length(); i++) {
			wordCount = 0;
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					wordCount++;
				}
			}

			tileCount = 0;
			for (int k = 0; k < tiles.length(); k++) {
				if (word.charAt(i) == tiles.charAt(k)) {
					tileCount++;
				}
			}
			

		}
		return tileCount >= wordCount;

	}
}
