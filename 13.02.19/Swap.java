/*  Swap Two Strings
To swap two string in Java Programming, you have to first ask to the
 user to enter the two string, then make a temp variable of the same type. 
 Now place the first string in the temp variable, then place the second 
 string in the first, 
now place the temp string in the second.*/
import java.util.Scanner;

public class Swap
{
    public static void main(String[] input)
    {
        String str1, str2, strtemp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter First String : ");
        str1 = scan.nextLine();
        System.out.print("Enter Second String : ");
        str2 = scan.nextLine();
        
        System.out.println("\nStrings before Swapping are :");
        System.out.print("String 1 = " +str1+ "\n");
        System.out.print("String 2 = " +str2+ "\n");
        
        strtemp = str1;
        str1 = str2;
        str2 = strtemp;
        
        System.out.println("\nStrings after Swapping are :");
        System.out.print("String 1 = " +str1+ "\n");
        System.out.print("String 2 = " +str2+ "\n");
    }
}