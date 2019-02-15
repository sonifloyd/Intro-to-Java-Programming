/*  Given a Binary Number B, Print its decimal equivalent.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follow. Each test case contains a single Binary number B. 

Output: 
For each testcase, in a new line, print each Decimal number in new line.

Constraints:
1 <= T <= 100
1 <= Digits in Binary <= 16

Example:
Input:
2
10001000
101100
Output:
136
44*/
import java.util.Scanner;
public class GFG10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();//no. of test cases
        for(int i=1;i<=t;i++){
            int in=sc.nextInt();
            binTodec(in);
        }
        
    }
    static void binTodec(int n){
        int sum=0;
        while (n>0)
        sum=sum+Math.pow(2,i)*n%10;
        n=n/10;
        i++;

    }
    System.out.println(sum);
}