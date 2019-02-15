/* Check Anagram or Not
To check whether the two string are anagram or not anagram in 
Java programming, you have to ask to the user 
to enter the two string to start checking for anagram.*/
import java.util.Scanner;
public class Anagram{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st string");
        String st1=sc.next();
        System.out.println("Enter 2nd string");
        String st2=sc.next();
    }
    static boolean isAnagram( String s1,String s2){
        if(s1.length()!=s2.length())
        return false;
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        for( int i=0;i<s1.length();i++){
            for( int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j))
            }
        }
    }
}