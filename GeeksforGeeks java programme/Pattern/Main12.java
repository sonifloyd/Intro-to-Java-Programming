


/*

* * * * *
* *   * *
*   *   *
* *   * *
* * * * *

*/
public class Main12{
    public static void main(String[] args) {
        isPrint();
    }
    static void isPrint(){
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 ||j==n  || i==j  ||i+j==n+1)//i==j for 1st diagonal where value of i is equal to j(3*3)
                System.out.print("* ");               // i+j==n+1 means 2nd diagonal 
                else 
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}

