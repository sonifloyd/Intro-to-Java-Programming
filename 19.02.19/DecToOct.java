/*  Convert Decimal to Octal
To convert decimal to octal in Java Programming, you have to ask to the 
user to enter any number in decimal number format to convert it into octal 
number format to display the 
equivalent value in octal number system as shown in the following program*/
import java.util.Scanner;
public class DecToOct{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter element");
        int dec=sc.nextInt();
        String oc=dectooct(dec);
        System.out.println(" decimal to octal of"+ dec +" is"+ oc);
    }
    static String  dectooct(int n){
        String oct="";
        while(n !=0){
            int r=n%8;
            oct=r+oct;
            n=n/8;

        }
        return oct;

    }
}