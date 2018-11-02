
/**
  Write a programme to calculate a cube root of a integer with user input
 */
import java.util.Scanner;
public class cubeRoot
{
  public static void main(String[] args)
  {
      System.out.println("Enter a number");
      Scanner abc=new Scanner(System.in);
      double n =abc.nextDouble();
      double result=Math.cbrt(n);
      System.out.println("The cube root of number is " + result);
    }
}
