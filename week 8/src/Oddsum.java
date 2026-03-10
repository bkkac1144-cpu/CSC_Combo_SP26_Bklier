
public class Oddsum {

	public static void main(String[] args) {
		int sumOdds = oddSum(999);
System.out.println(sumOdds);
	}

	private static int oddSum(int i) {
		if(i < 1) return 0;
		System.out.println(i);
		return oddSum(i - 2) + i;
	}

}
