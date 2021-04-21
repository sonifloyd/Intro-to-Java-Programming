

/*ABCDEFG
ABC DEF
AB   CD
A     B*/

/*ABCDCBA
ABC CBA
AB   BA
A     A
*/

package pattern;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			char ch='A';

			for (int j = 1; j <= 2 * n - 1; j++) {

				if (j <= n + 1 - i || j >= n - 1 + i) {
					System.out.print(ch);
					if(j<4) {
					ch++;}
					else {
						ch--;
					}
					

				} else {
					System.out.print(" ");
					if(j==4)
						ch--;
				}

			}
			System.out.println();
		}

	}

}
