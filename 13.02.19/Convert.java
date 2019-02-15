/* Convert Lowercase to Uppercase
To convert/change lowercase string/character to uppercase string/character in 
Java programming,
 you have to use ASCII value to convert the lowercase character 
 into uppercase character as shown in the following first program. 
 And the second program, uses the method toUpperCase() to convert lowercase
  string into uppercase string.*/
  import java.util.Scanner;

public class Convert
{
    public static void main(String[] input)
    {
        char ch;
        int temp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Character in Lowercase : ");
        ch = scan.next().charAt(0);
        convert(ch);
    }
        static void convert( char c){
            int temp=(int) c;
            temp=temp-32;
            c=(char) temp;
        System.out.print("Equivalent Character in Uppercase = " +c);
    }
}