
/**
 * Write a description of class FibonacciSeriesExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FibonacciSeriesExample
{
   public static void main(String[] args)
   {
       int a=-1,b=1,c,i,n=10;
       for(i=1; i<=n;i++)
       {
           
    
           c=a+b;
           System.out.println(c);
           a=b;
           b=c;
        }
    }
}