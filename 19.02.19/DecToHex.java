/*  Convert Decimal to Hexadecimal
To convert decimal to hexadecimal in Java Programming, you have to 
ask to the user to enter any number in decimal number format to convert 
it into hexadecimal number format to display the equivalent value in hexadecimal
 number system as shown in the following program.

 */
import java.util.Scanner;
public class DecToHex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number");
        int dec =sc.nextInt();
        String hex=dectohex(dec);
        System.out.println(" decimal to octal of "+dec+"is"+ hex);

    }
    static String  dectohex(int n){
        String hexa="";
        while(n !=0){
            int r=n%16;
            hexa=r+hexa;
            n=n/16;

        }
        return hexa;

    }
}