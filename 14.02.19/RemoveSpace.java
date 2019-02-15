/* Remove Spaces from String
To remove/delete spaces from the string or sentence in Java programming, 
you have to ask to the user to enter the string. 
Now replace all the spaces from the string using the method replaceAll(). */
import java.util.Scanner;
public class RemoveSpace{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String st=sc.nextLine();
        isRemove(st);
        
    }
    static void isRemove( String s){
        String ns="";
        char[] ch=s.toCharArray();//convert into array
        for(int i=0;i<ch.length;i++){

        
        if(ch[i]!=' '){
            ns=ns+ch[i];
        }

      }
    System.out.println(ns);
}

}