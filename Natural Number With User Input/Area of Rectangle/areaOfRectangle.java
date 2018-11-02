
/**
 Calculate area of Rectangle with user input
 */
import java.util.Scanner;
public class areaOfRectangle
{
    public static void main(String[] args)
    {
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter length and breath of a rectangle");
        int l=abc.nextInt();
        int b=abc.nextInt();
        int ar=l*b;
        System.out.println("Area of rectangle is "+ar);
    }
}
        
    