

/* WAJP to convert  user input string in lowercase */
import java.util.Scanner;
public class LowerCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        String st=s.toLowerCase();
        System.out.println("String is in LowerCase:"  + st);

        
    }
    static String toLowerCase(String str){
        char[]  ch=str.toCharArray();//convert the string into Array
        String nstr="";//create a empty string
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>=65  &&  ch[i]<=90){
                /* if any alphabet is in uppercase convert it into lower case*/
                nstr=nstr+((char)ch[i]+32);
            }
            else{
                nstr=nstr+ch[i];//if it is in lower case no need to convert
            }
            

        }
       return nstr;
    }
    
}