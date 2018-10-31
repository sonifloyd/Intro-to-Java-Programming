

/* WAJP  to get the charcter at the given index within the string*/
import java.util.Scanner;
public class StringProblm1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String input= sc.nextLine();
        int length=input.length();// give string length
        System.out.println("Enter a index no b/w 0 to "+(length-1));
        int index=sc.nextInt();
        if(index<0 || index >= length){
            System.out.println("Invalid Input");

        }
        else{
            System.out.println("Character at given position:"+ " "+input.charAt(index));
        }
    }
}