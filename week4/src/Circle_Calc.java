import java.util.Scanner;

public class Circle_Calc {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
		System.out.println("Enter radius");
		double radius = input.nextDouble();
		double area = calculateDiameter(radius);
		System.out.println(calculateArea(radius));
		System.out.println(calculateCirc(radius));
		System.out.println(calculateDiameter(radius));

	}

	private static double calculateDiameter(double radius) {
		double result = 2 * radius;
		return result;

	}
	private static double calculateArea(double radius) {
		double result = Math.PI * radius * radius;
		return result;
		

	}
	private static double calculateCirc(double radius) {
		double result = 2 * Math.PI * radius;
		return result;
	
		
		
		
	}
}

