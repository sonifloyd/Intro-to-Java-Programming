package pattern;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//int n = scan.nextInt();
		int k=0;

		for (int i = 1; i <=9; i++) {
			
			if(i<=5) {
				k++;
			}
			else {
				k--;
			}

			for (int j = 1; j <=9; j++) {

				if (j <=6-k ||j>=4+k) {
					System.out.print("*");
					
					

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

	}

}
}
