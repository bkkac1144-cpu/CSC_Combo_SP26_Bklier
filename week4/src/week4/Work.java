package week4;

import java.util.Scanner;

public class Work {

	public static void main(String[] args) {
		/********************************************************
		 * Doing whatever *
		 * 
		 * @author S02960916 *
		 *******************************************************/
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a number and I will tell you if it is positive");
		int num = input.nextInt();

		boolean pos = isPositive(num);
		System.out.println("The number is ");
		if (pos)
			System.out.println("Positive");
		else
			System.out.println("Negative");

		/**
		 * Take three numbers from the user and print the greatest number. main() should
		 * call a method named greatestNumber() that takes the 3 numbers and returns the
		 * greatest number. (Call the class Exercise2)
		 */
		System.out.println("Enter three numbers I will tell you the greatest one");
		num = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		System.out.println(greatestNumber(num, num2, num3));
		/**
		 * Write a Java program that reads a floating-point number and prints "zero" if
		 * the number is zero. Otherwise, print "positive" or "negative" if the number
		 * is positive or negative respectively. Add "small" if the absolute value of
		 * the number is less than 1, or "large" if it exceeds 1,000,000 (Call the class
		 * Exercise3)
		 */
		System.out.println("Enter a float");
		double real = input.nextDouble();
		System.out.println(realPositive(real));

		/**
		 * Write a Java program that reads a number from the user between 1 and 7, calls
		 * a method called getWeekDay() to get the day of the week corresponding to the
		 * number, and displays the name of the weekday. (Call the class Exercise4)
		 */
		System.out.println("Enter a number between 1 and 7");
		int dayNum = input.nextInt();
		System.out.println(getWeekDay(dayNum));

	}

	private static String getWeekDay(int dayNum) {
		String ret = null;
		switch (dayNum) {
		case 1:
			ret = "Sunday";
		case 2:
			ret = "Monday";
		case 3:
			ret = "Tuesday";
		case 4:
			ret = "Wensday";
		case 5:
			ret = "Thursday";
		case 6:
			ret = "Friday";
		case 7:
			ret = "Satuday";

		}
		return ret;
	}

	private static String realPositive(double real) {
		String ret = "";
		if (real > 0)
			ret += "positive, ";
		else if (real == 0)
			ret += "zero, ";
		else
			ret += "negative, ";

		if (Math.abs(real) < 1)
			ret += "small";
		else if (Math.abs(real) > 1000000)
			ret += "large";

		return ret;
	}

	private static int greatestNumber(int num, int num2, int num3) {
		if (num > num2 && num > num3)
			return num;
		if (num2 > num && num2 > num3)
			return num;
		return num3;
	}

	private static boolean isPositive(int num) {
		return num > 0;

	}

}
