
/**
 print 1st N even natural number with user input */
 import java.util.Scanner;
public class EvenNaturalNumber
{
  public static void main(String[] args)
{
    Scanner abc=new Scanner(System.in);
    System.out.println("Enter a Natural No.");
    int N=abc.nextInt();
for(int i=1;i<=N;i++)
System.out.println(" "+2*i);
}
}  