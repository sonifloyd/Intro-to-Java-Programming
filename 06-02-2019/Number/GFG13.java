/*Given two numbers A and B. The task is to find out their LCM and GCD.

Input:
The first line of input contains an integer T denoting the number of testcases. T testcases follow. In each test cases,
 there are two numbers A and B separated by space.

Output:
For each testcase in a new line, print LCM and GCD separated by space.

Constraints:
1 <= T <= 30
1 <= a <= 1000
1 <= b <= 1000

Example:
Input:
2
5 10
14 8

Output:
10 5
56 2

 */
import java.util.Scanner;
public class GFG13{
    static int  isLCM(int a,int b)
    {
        for(int i=1;i<=a*b;i++)
            if(i%a==0 && i%b==0) {
               return i;
            }
        
        //return i;
    }
    //return i;
    static int  isGFM(int a,int b)
    {
        for( int H=a<b ?a:b;H>=1;H--)
            if(a%H==0 && b%H==0){
            return H;
            }
        
        //return H;
    }
    //return H;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
             int res=isLCM( a,b);
            System.out.println(res);
            int resu=isGFM(a,b);
            System.out.println(resu);
        }

        
    }
}