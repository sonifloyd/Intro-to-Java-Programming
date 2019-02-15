/*  Remove Vowels from String
To delete or remove vowels from string in Java programming, you have to first
 ask to the user to enter the string and start deleting/removing all the vowels 
 present in the string.*/
 import java.util.Scanner;


 public class RemoveVowel{
     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter a sentance");
         String  str=sc.nextLine();
         String strNew=str.replaceAll("[aeiou]","");
         System.out.println(" after removing vowels");
         System.out.println(strNew);

     }
 }