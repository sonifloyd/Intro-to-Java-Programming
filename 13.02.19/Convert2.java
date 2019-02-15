/* Convert Uppercase to Lowercase
To convert or change uppercase string or character to lowercase 
string or character in Java Programming, use the ASCII values of 
character to convert any character from uppercase to lowercase as shown 
in the first program. And the second program uses the method toLowerCase() to 
convert string from uppercase to lowercase.*/
import java.util.Scanner;

public class Convert2
{
    public static void main(String[] input)
    {
        char ch;
        int temp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Character in Uppercase : ");
        ch = scan.next().charAt(0);
        convert(ch);
    }
        static void convert( char c){
            int temp=(int) c;
            temp=temp+32;
            c=(char) temp;
        System.out.print("Equivalent Character in Lowercase = " +c);
    }
}