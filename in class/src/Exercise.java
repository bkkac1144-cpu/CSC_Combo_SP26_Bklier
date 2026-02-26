import java.util.Scanner;

public class Exercise {
	

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println(" Enter a word and i will check if it's abcedarian ");
	String word = input.next();
	String lWord = word.toLowerCase();
	if(isAbcedarian(lWord)) {
		System.out.println(word + " is abcedarian");
	}
	else {
		System.out.println(word + " is not abcedarian");
	}

	if(isDubloon(lWord)) {
		System.out.println(word + " is a doubloon! WE HIT GOLD");
	}
	else {
		System.out.println(word + " is not a doubloon. waste of time");
	}
	}
	/************************************************************
	 * A word is said to be a "doubloon" if every letter that   *
	 * appears in the word appears exactly twice. write a method*
	 * called isDoubloon that takes a string and checks wether  *
	 * it us a doubloon. to ignore case, invoke the toLowerCase *
	 * method before checking.                                  *
	 ************************************************************/
	private static boolean isDubloon(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if(word.charAt(i) == word.charAt(j)) {
					count++;
				}
			}
			if(count > 2 || count < 2) {
				return false;
			}
			count = 0;
			
		}
		return true;
	}

	private static boolean isAbcedarian(String word) {
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i) < word.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}

}
