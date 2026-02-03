import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double fahrenheit, celsius, kelvin;
		
		System.out.println("What is the temperature?");
		fahrenheit = input.nextDouble();
		
		celsius = (fahrenheit - 32) * 5 / 9;
		kelvin = celsius + 273.15;
		
		System.out.printf("There are %.3f fahrenheit in %3f celsius", fahrenheit, celsius);
		System.out.printf("The temp %.3f celsius %3f in kelvin", celsius, kelvin);

	}

}
