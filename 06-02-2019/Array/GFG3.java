
/* Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains 2 lines of input. The first line of each testcase contains the size of array N. The following line contains elements of the array separated by spaces.

Output:
For each testcase, print the minimum and maximum element of the array.

Constraints:
1 <= T <= 100
1 <= N <= 1000
1 <= Ai <=1012

Example:
Input:
2
6
3 2 1 56 10000 167
5
1 345 234 21 56789
Output:
1 10000
1 56789 */
import java.util.Scanner;

public class GFG13 {
    static void min(int ar[], int n) {
        int min = ar[0];

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }

        }
        System.out.println(min);
    }

    static void max(int ar1[], int p) {
        int max = ar1[0];
        for (int i = 1; i < ar1.length; i++) {
            if (ar1[i] > max) {
                max = ar1[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner (System.in);
    int t=sc.nextInt();//no. of test cases
    for(int i=1;i<=t;i++){
    int in=sc.nextInt();
    int a[]=new int[in];
    int len=a.length;// length of array
    for(int j=0;j<a.length;j++){
        a[j]=sc.nextInt();
    }

        max( a,in);
        min( a, in);


   }
}
}