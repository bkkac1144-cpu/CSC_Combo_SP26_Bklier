import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to check if it's prime");
		int n = input.nextInt();
		
		if(isPrime(n)) {
			System.out.println(n + " is prime");
		}
		else {
			System.out.println(n + " is not prime");
		}
		

	}

	private static boolean isPrime(int n) {
		if(n < 2) return false;
		if(n == 2) return true;
		if(n %2 == 0) return false;
		for(int i = 3; i <= Math.sqrt(n); i+= 2) {
			if(n % i == 0)return false;
		}
		return true;
	}

}
