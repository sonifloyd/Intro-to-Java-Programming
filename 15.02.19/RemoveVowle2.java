

/* remove vowels without using method  */
import java.util.Scanner;
public class RemoveVowle2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter a sentance");
        String str=sc.nextLine();
        isRemove( str);
    }
    static void isRemove(String s){
        String strNew="";
        for(int i=0;i<s.length();i++){
            
            if ( s.charAt(i)!='A' || s.charAt(i)!='E' || s.charAt(i)!='I' || 
            s.charAt(i)!='O' || s.charAt(i)!='U' || s.charAt(i)!='a' ||
            s.charAt(i)!='e' || s.charAt(i)!='i' || s.charAt(i)!='o' ||
            s.charAt(i)!='u' ){
                strNew=strNew+s.charAt(i);

            }
        }
        System.out.println("After removing vowels " + strNew);
    }
}