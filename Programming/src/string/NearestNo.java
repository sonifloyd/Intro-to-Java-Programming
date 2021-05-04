package string;

public class NearestNo {

	static int round(int n) {
		// Smaller multiple
		int a = (n / 10) * 10;

		// Larger multiple
		int b = a + 10;

		// Return of closest of two
		return (n - a > b - n) ? b : a;
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		int n = 15;
		System.out.println(round(n));
	}

}
