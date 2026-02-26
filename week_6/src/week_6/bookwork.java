package week_6;

import java.util.Scanner;

public class bookwork {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fruit = "bannana";

		char letter = fruit.charAt(0);
		System.out.println(letter);
		System.out.println("Type banana");
		fruit = input.next();
		if (fruit.equals("banana"))
			System.out.println("True");
		else
			System.out.println("False");

		System.out.println("Roman Alphabet: ");
		for (char c = 'A'; c < 'Z'; c++) {
			System.out.println(c);
		}
		char c = 'A';
		System.out.println();
		while (c <= 'Z') {
			System.out.println(c);
			c++;
		}
		for (int i = 913; i <= 913; i++) {
			System.out.println((char) i);
		}
		System.out.println("Enter a number");
		while (!input.hasNextDouble()) {
			String word = input.next();
			System.err.println(word + " is not a number!");
			System.out.println("enter  number");
		}
		double num = input.nextDouble();
		System.out.println(num);

		String words = "Hello World, how are you? Probably off better than me!";
		for (int i = 0; i < words.length(); i++) {
			letter = words.charAt(i);
			System.out.println(letter);
		} int len = words.length();
		char last = words.charAt(len - 1);
		
		String rev = reverse(words);
		System.out.println(rev);
		
		int index = words.indexOf('o', words.indexOf('o')+1);
		System.out.println(index);
		index = words.lastIndexOf('o');
		System.out.println(index);
		
		System.out.println(words.substring(25));
		
		System.out.println("Enter yes or no: ");
		String word = input.next();
		word = word.toLowerCase();
		if(word.equals("yes")) {
			System.out.println("Hell " + word);
			
		} if(word == "no") {
			System.out.println("Awwwwwwwwwww");
		}
		
		String n1 = "Ada Wong";
		String n2 = "Leon Kennedy";
		int diff = n1.compareTo(n2);
		if(diff < 0) {
			System.out.println(n1 + " comes before " + n2 + " alphabetically. ");
		}else if(diff > 0) {
			System.out.println("n2 comes before n1 alphabetically. ");
		}else {
			System.out.println(" Names are the same");
		} System.out.println(diff);
		
		
	}

	private static String reverse(String words) {
		String ret = "";
		for(int i = words.length()-1;i >= 0; i--) {
			ret += words.charAt(i);
		}
		return ret;
	}

}
