import java.util.Arrays;

public class Largest3rdNumber {
	public static void main(String[] args) {
		int arr[]= {1,2,5,6,3,2};
		 Arrays.sort(arr);
		System.out.println("Third largest number :" + arr[arr.length -3]);
	}
}
