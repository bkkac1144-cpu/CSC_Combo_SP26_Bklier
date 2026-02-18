import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		int sum = 0;
		while(i < 10) {
			sum += i;
			i ++;
		}
		System.out.println("the sum is " + sum);
		
		sum = 0;
		for(i = 0; i < 10; i++);
		{
			sum += i;
			
		}
		System.out.println("the sum is " + sum);
		int j = 50;
		int n = 0;
		int n2 = 1;
		System.out.println("which level of the fibonacci do you want?");
		int count = input.nextInt();
		
		if(count == 1) System.out.println(n);
		else if (count == 2)System.out.println(n +"\n" + n2);
		System.out.println(n + "\n" + n2);
		for(i = 2; i < count; i++){
			int n3 = n + n2;
			System.out.println(n3);
			n = n2;
			n2 = n3;
		}
		System.out.println("***********************");
		n = 0;
		n2 = 1;
		System.out.println(n +"\n" + n2);
		i = 2;//initializer
		while(i < count){//condition
			int n3 = n + n2;
			System.out.println(n3);
			n = n2;
			n2 = n3;
			i++;
		}

	}

}
