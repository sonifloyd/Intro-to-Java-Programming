package pattern;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		

		for (int i = 1; i <=n; i++) {
			
     
			for (int j = 1; j <=2*n; j++) {
				
				 

				if (j >=n+1-i && j<=2*n+1-i) {
					System.out.print("*");
					
					
					
					

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

	}

	}

}
