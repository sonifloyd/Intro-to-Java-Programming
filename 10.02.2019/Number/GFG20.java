/* Given a number N, check if a number is perfect or not. A number is said to
 be perfect if sum of all its factors excluding the number itself is 
 equal to the number.

Input:
First line consists of T test cases. Then T test cases follow .Each test case consists of a number N.

Output:
For each testcase, in a new line, output in a single line 1 if a number is a perfect number else print 0.

Constraints:
1 <= T <= 300
1 <= N <= 1018

Example:
Input:
2
6
21
Output:
1
0 */
import java.util.Scanner;
public class GFG20{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();//no. of test cases
        for(int i=1;i<=t;i++){
            int N=sc.nextInt();
            isPerfect(N);
        }
        
    }
    static void isPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
             sum=sum+i;
            }
            
        }
        //System.out.println(sum);
        if(n==sum)
        System.out.println("1");
        else
        System.out.println("0");
    }
}