/* Delete Words from Sentence
To delete any particular word from the string/sentence in Java Programming, 
first, you have to ask to the user to enter the string/sentence, 
second ask to enter the any word present in the string/sentence to
 delete that word from the string. After asking the two, now check for the 
 presence of that word and perform the deletion of that word from the sentence 
 as shown in the following program.

 */
import java.util.Scanner;
public class Delete{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter a sentance");
        String str=sc.nextLine();
        System.out.println(" Enter a word");
        String word=sc.nextLine();
        str=str.replaceAll(word,"");
        System.out.println(str);
        
    }

}