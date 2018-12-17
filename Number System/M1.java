

/* print fabonacci  serie*/
import java.util.Scanner;
public class M1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n");
        int x=sc.nextInt();
        
      fab(x);
    }  
    
  /*  int a=-1;
    int =b=1;
    int =c;*/
    static void fab(int n){
        int a=-1;
    int b=1;
    int c;
    
       for( int i=1;i<=n;i++){
           c=a+b;
           System.out.println(c);
           a=b;
           b=c;
       }
      // return c;
      // System.out.println(c);

    }
}