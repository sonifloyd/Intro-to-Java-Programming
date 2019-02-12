/*  Check Prime or Not
To check whether the input number is a prime number or 
not a prime number in Java programming, you have to ask to 
the user to enter the number and start checking for prime number. 
If number is divisible from 2 to one less than that number, then the 
number is not prime number
 otherwise it will be a prime number. */
 import java.util.Scanner;
 public class codescrack3{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int in=sc.nextInt();
         boolean rs=isPrime(in);
         if(rs)
         System.out.println( "  prime");
         else
         System.out.println("  not prime");
         
         
     }
     static boolean isPrime(int n){
         for(int i=2;i<n;i++){
             if(n%i==0){
                 return false;
             }
         }
         return true;
     }
 }