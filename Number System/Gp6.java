
/* For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is 
an Armstrong number since 33 + 73 + 13 = 371  */
import java.util.Scanner;
public class Gp6{
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        int len =0;
        while(n>0){
            n=n/10;
            len =len +1;
        }
        System.out.println(" length is "+len);
        int rem=0;
        int arm=0; int mult=1;
        while(n>0){
            rem=n%10;
            for(int i=0;i<=len;i++){
                mult=mult*rem;
            }
            arm=arm+mult;
            n=n/10;
            
        }
        if(arm==n){
            System.out.println("No. is armstrong no.");
        }
        else
        System.out.println("No is not armstrong");

    }
}