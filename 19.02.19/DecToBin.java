/* Convert Decimal to Binary
To convert decimal to binary in Java Programming, you have to ask to 
the user to enter any number in decimal number format to convert it into
 binary number format to display the 
equivalent value in binary number system as shown in the following program.  */
import java.util.Scanner;
public class DecToBin{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the element");
        int dec=sc.nextInt();
        String b=dectobin(dec);
        System.out.println(" Decimal to binary"+ dec+ " is" + b);
       
        

    }
    static String  dectobin(int n){
        String bin="";
        while(n !=0){
            int r=n%2;
            bin=r+bin;
            n=n/2;

        }
        return bin;

    }
}