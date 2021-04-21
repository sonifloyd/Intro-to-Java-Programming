
/*1   
  121  
 12321 
1234321
*/


package javaprogramming;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			int k = 1;

			for (int j = 1; j <= 2 * n - 1; j++) {

				if (j >= n + 1 - i && j <= n - 1 + i) {
					System.out.print(k);
					if (j < 4) 
						k++;
					 else
						k--;

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}
