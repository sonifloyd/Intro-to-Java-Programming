/*   Perform Mathematical Operations
To perform mathematical operations such as addition, subtraction, 
multiplication and division of any two number in Java Programming,
 you have to ask to 
the user to enter the two number and then perform the action accordingly.*/
import java.util.Scanner;
public class codescrack{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        isMathematical( a,b);

    }
    static void isMathematical( int p,int q){
        int add = p+q;
        System.out.println( "addition  :" + add);
        int add = p-q;
        System.out.println( " substraction :" + add);
        int add = p*q;
        System.out.println( "multiplication  :" + add);
        int add = p/q;
        System.out.println( "divide  :" + add);
    }
}