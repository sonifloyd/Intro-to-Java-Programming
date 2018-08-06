
/**
  print 1st N  odd natural number with user input
 */
import java.util.Scanner;
public class OddNaturalNumber
{
    public static void main(String[] args)
    {
      Scanner abc=new Scanner(System.in);
System.out.println("Enter a natural no.");
int N=abc.nextInt();
for( int i=1; i<=N;i++)  
System.out.println(" "+(2*i-1));
}
}