
/*  Write a program to calculate nPr. nPr represents n permutation r and value of nPr is (n!) / (n-r)!.

Input: 
The first line of the input contains T denoting the number of testcases. T testcases follow. First line of the test case will be the value of n and r respectively.

Output:
For each test case, in a new line, output will be the value of nPr.

Constraints:
1 <= T <= 100
1 <= n,r <= 20
n >= r

Example:
Input:
2
2 1
10 4
Output:
2
5040*/
import java.util.Scanner;
public class GFG17{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();//no. of test cases
        for(int i=1;i<=t;i++){
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        System.out.println("Enter value of r");
        int r=sc.nextInt();
        System.out.println( "npr:"+fact(n)/(fact(n-r)));
        }
        
    }
    static int  fact(int n){
        int factr=1;
        for(int i=1;i<=n;i++){
            factr=factr*i;
        }
        return factr;
    }
}