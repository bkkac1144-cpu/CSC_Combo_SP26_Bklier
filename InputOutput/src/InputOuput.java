/**
 * This is my notes for Java input and output
 * @author S02960916
 * @date 02/02/26
 * 
 */

import java.util.Scanner;

public class InputOuput {

	public static void main(String[] args) {
		//this is my Scanner it is how we get input from the 
		//keyboard in this case
		Scanner input = new Scanner(System.in);
		
	System.out.println("What is your name?");
	String name = input.next();//next grabs up to the first white space
	//like tab, space, or enter
	System.out.println("Hello, " +name
			+ ", how old are you?");
	
	int age = input.nextInt();//nextint grabs the next whole number
	System.out.println("Wow " +age
			+ " is a good age! old ass");
	System.out.println("Give me a real number");
	
	double num = input.nextDouble();// nextdouble grabs the next real number
	System.out.printf("Here is your real number:%.3f\n",num);
	
	System.out.println(name.charAt(0));//charat() grabs whichever letter is at
	//the index in parenthesis 
	
	//This clears the "New line" left in the buffer
	input.nextLine();
	System.out.print("Enter a sentence");
	//grabs any input until the enter key is pressed
	String sentence = input.nextLine();
	System.out.println(sentence);
	}

}
