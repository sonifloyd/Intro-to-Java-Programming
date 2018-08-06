
/**
 print sum of 1st N natural number with user input
 */
import java.util.Scanner;
public class NaturalNumber
{
    
   
        public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
System.out.println("Enter a natural number");
int N=sc.nextInt();
int s=0;
  for(int i=1;i<=N;i++)
  {
      s=(i*(i+1))/2;
    }
  System.out.println(" "+s);
}
}