

/*
 
   1   
  12A  
 123AB 
1234ABC

  
  
 */



package pattern;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
char k=49;
		for (int i = 1; i <=n; i++) {
			k=49;
     
			for (int j = 1; j <=2*n-1; j++) {
				
				
				
				 

				if (j >=n+1-i && j<=n-1+i) {
					System.out.print(k);
					
					
					k++;
					 if(j==4) { k='A'; }
					
					
					

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

	}
		

	}

}
