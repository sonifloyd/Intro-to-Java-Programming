
/**
 
 */
import java.util.Scanner;
public class primeNumber
{
   public static void main(String[] args)
   {
     System.out.println("enter a no.");
     Scanner abc=new Scanner(System.in);
     int n=abc.nextInt();
     int i;
     for(i=2;i<=n-1;i++){
    
     if(n%i==0){ 
     System.out.println("Number is not prime");
             break;
            }
    }
    
    if(i==n)
    {
     System.out.println("Number is  prime");
    }

}
    
}
