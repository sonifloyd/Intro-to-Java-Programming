
 /* WAJP TO COMPARE TWO STRING*/
 import java.util.Scanner;
public class CompareString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  1st string");
        String s1=sc.nextLine();
        System.out.println("Enter the 2nd string");
        boolean b=isCompare(s1, s2);
        if (b)
        System.out.println(" string is equal");
        else
        System.out.println("string is not equal");

        
    }


static boolean isCompare(String s1,String s2){
    if(s1.length()  ! = s2.length())
    return false;
    else {
        Char ch1[]=s1.toCharArray();
        Char ch2[]=s2.toCharArray();
        for(int i=0;i<ch1.length;i++)
        {
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
    }return true;
}}