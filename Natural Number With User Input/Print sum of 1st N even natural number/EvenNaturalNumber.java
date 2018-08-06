
/**
 print 1st N even natural number
 */
import java.util.Scanner;
public class EvenNaturalNumber
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
System.out.println("Enter a natural number");
int N=sc.nextInt();
int s=0;
  for(int i=1;i<=N;i++)
  {
      s=(s+2*i);
    }
  System.out.println(" "+s);
}
}