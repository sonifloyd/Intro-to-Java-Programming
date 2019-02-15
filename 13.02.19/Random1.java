/*  Generate Random Numbers
To generate random numbers in Java programming, you have to create the object of
 Random class available in the java.util.Random package	as 
shown in the following program.*/
import java.util.Scanner;
import java.util.Random;
public class Random1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter how many random n. u want ");
        
        int in =sc.nextInt();
        Random rn=new Random();
        System.out.println(" genrating "+ n+ " random no. form 0 to");
        for ( int i=0;i<n;i++){
            int  ran =rn.nextInt(1000);
            System.out.println(" ran");

        }
        
        
    }
    
}