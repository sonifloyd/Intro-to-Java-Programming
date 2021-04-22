

/*
 
   1
   12
  123
 1234
12345
 1234
  123
   12
    1
 
  
 */



package pattern;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k=0;

		for (int i = 1; i <= 2*n-1; i++) {
			int p=1;
			if(i<=5) {
				k++;
			}
			else {
				k--;
			}

			for (int j = 1; j <=n; j++) {

				if (j >=6-k) {
					System.out.print(p);
					p++;
					

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}


	}

}
