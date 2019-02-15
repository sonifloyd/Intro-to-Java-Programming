/*  Check Leap Year or Not
To check whether the input year is a leap year or not a leap year in 
Java Programming, you have to ask to the user to enter the year and 
start checking for the leap year. */
import java.util.Scanner;
public class Leap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in=sc.nextInt();
        checkLeap(in);
        
    }
    static void checkLeap( int n){
        if(n%4==0)
        System.out.println("Leap year");
        else 
        System.out.println(" Not Leap");
    }
}