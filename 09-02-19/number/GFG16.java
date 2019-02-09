/* alculate the factorial for a given number N.

Input:
The first line contains an integer 'T' denoting the total number of test cases. T testcases follow. In each test cases, it contains an integer 'N'.

Output:
For each testcase, in a new line, output the answer to the problem.

Constraints:
1 <= T <= 19
0 <= N <= 18

Example:
Input:
1
1
Output:
1 */
import java.util.Scanner;
public  class GFG16{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int in=sc.nextInt();
            factorial(in);
        }
        
        
    }
    static void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}