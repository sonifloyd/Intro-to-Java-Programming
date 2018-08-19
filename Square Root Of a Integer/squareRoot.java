
/**
 write a programme to calculate square root of a interger with user input
 */
import java.util.Scanner;
public class squareRoot
{
    public static void main(String[] args)
    {
        System.out.println("Enter a Number");
        Scanner abc=new Scanner(System.in);
        double n =abc.nextDouble();
         double result=Math.sqrt(n);
         System.out.println("The Square of number is  " + result);
        }
    }