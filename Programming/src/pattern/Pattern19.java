package pattern;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		

		for (int i = 1; i <=n; i++) {
			char ch='A';

			for (int j = 1; j <=2*n-1; j++) {

				if (j >=5-i && j<=3+i) {
					System.out.print(ch);
					if(j<4)
					ch++;
					else
						ch--;
					
					

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

	}

	}

}
