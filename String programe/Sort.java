 
 /* WAJP TO sort the string  in alphabetic order user input */
 import java.util.Scanner;
 public class Sort{
     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the string");
         String s =sc.nextLine();
         String stg = s.isSort();
          System.out.println("new string is: "+stg);
         
     }
     static String isSort(String str){
         char[] ch=str.toCharArray();
         for(int i=0;i<ch.length-1;i++){
             for(int j=i+1;j<ch.length;j++){
                 if(ch[i]>ch[j]){
                     char t=ch[i];
                     ch[i]=ch[j];
                     ch[j]=t;
                 }
             }
         } String st =new String(ch);
         return st;
     }
 }