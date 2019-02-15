/*  Count Word in Sentence
To count the occurrence of all the words present in a string/sentence 
in Java Programming, first, you have to ask to the user to enter the 
sentence and start counting all the words with present in the given 
string/sentence using the method countWords() as shown in the following program.

 */
import java.util.Scanner;
public class CountWord{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a Sentance");
        String st=sc.nextLine();
        isCount(st);
    }
    static void isCount( String s){
        int count=1;
        for( int i=0;i<s.length();i++){
        if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
            count++;
        }
    }
    
    System.out.println("No. of words in sentance is" + count);
}
}