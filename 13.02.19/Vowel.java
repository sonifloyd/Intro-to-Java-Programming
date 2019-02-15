/* Check Vowel or Not
To check whether the input alphabet is a vowel or not in Java Programming, 
you have to ask to the user to enter a character (alphabet) and check if the 
entered character is equal to a, A, e, E, i, I, o, O, u, U. If it is equal to 
any one of the 10, 
then it will be vowel otherwise it will not be a vowel. */
import java.util.Scanner;


public class Vowel{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char in=sc.next().charAt(0);
        checkVowel(in);
        
    }
    static void checkVowel( char ch){
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='O'||
         ch=='E'|| ch=='I'|| 
        ch=='U')
        System.out.println("Vowel");
        else 
        System.out.println("not vowel");
    }
}