
/*

   1   
  232  
 34543 
4567654
*/


package pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		

		for (int i = 1; i <= n; i++) {
			
             int k=i;
			for (int j = 1; j <=2*n-1; j++) {

				if (j >=n+1-i&&j<=n-1+i) {
					System.out.print(k);
					if(j<4)
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
