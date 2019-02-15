/* Check Alphabet or Not
To check whether the entered character is an alphabet or not an 
alphabet in Java Programming, you have to ask to the user to enter a 
character and start checking for alphabet. If the character is in between 
a to z(will be alphabet) or A to Z(will also be alphabet) otherwise it will not 
be an alphabet.

 */
import java.util.Scanner;
public class CheckAlphabet{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        isChar(ch);
        
    }
    static void isChar(char ch){
        if(ch>='a'   && ch<='z'   || ch>='A'  && ch<='Z')
        System.out.println("Alphabet");
        else
        System.out.println("Not");
    }
}