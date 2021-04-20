
/**********
**** ****
***   ***
**     **
*       **/

package javaprogramming;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= 2 * n - 1; j++) {
				if (j <= n + 1 - i || j >= n - 1 + i)
				{
					System.out.print("*");

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
