/*  Find Smallest Element in Array
To find the smallest element in an array in Java programming, 
you have to ask to the user to enter the size and elements of the array,
 now start finding for the smallest element in the array to display the smallest 
element of the array on the screen as shown in the following program.*/
import java.util.Scanner;
public class Smallest{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of an array");
        int len=sc.nextInt();//size of an array
        int[] a= new int[len];
        System.out.println(" enter array of element");
        for( int i=0;i<len;i++){
            a[i]=sc.nextInt();
        }
        int min= isLargest(a);
        System.out.println( " Smallest element is " +min);

    }
    static int isLargest( int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
            min=arr[i];
        }
        return min;
    }
}