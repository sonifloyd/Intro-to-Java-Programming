/*  Check Original Equals Reverse or Not
To check whether the original number is equal to its reverse or not in 
Java programming, you have to ask to the user to enter the number and 
reverse that number then check that reverse is equal to the original or not, 
before reversing the number make a variable of the same type and place the value 
of the original 
number to that variable to check after reversing the number.*/
import java.util.Scanner;
public class Original{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in=sc.nextInt();
        reverse(in);

    }
    static  void  reverse(int n){
        int rev=0;
        int r=n%10;
        rev=rev*10+r;
        n=n/10;
        if(rev==n)
        System.out.println(" Equal");
        else 
        System.out.println(" Not Equal");
    }    
}