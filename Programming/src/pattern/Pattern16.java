package pattern;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k=0;

		for (int i = 1; i <= n; i++) {
			int p=1;
			if(i<=4) {
				k++;
			}
			else {
				k--;
			}

			for (int j = 1; j <=n; j++) {

				if (j ==i ||j==8-i) {
					System.out.print(" ");
					
					

				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}


	}

}
