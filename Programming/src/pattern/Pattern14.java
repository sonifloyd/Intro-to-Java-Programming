package pattern;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
int k=1;
		for (int i = 1; i<=7; i--) {
			
            // int k=i;
			for (int j = 1; j <=2*n-1; j++) {

				if (j<=8-k) {
					System.out.print("*");
					if(i<4)
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
