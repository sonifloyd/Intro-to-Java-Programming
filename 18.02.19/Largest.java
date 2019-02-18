/*  Find Largest Element in Array
To find the largest element in an array in Java Programming, 
first you have to ask to the user to enter the size and elements of the array.
 Now start finding for the largest element in the array to display the largest 
 element of the array on the output screen as shown in the following program.

 */
import java.util.Scanner;
public class Largest{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of an array");
        int len=sc.nextInt();//size of an array
        int[] a= new int[len];
        System.out.println(" enter array of element");
        for( int i=0;i<len;i++){
            a[i]=sc.nextInt();
        }
        int max= isLargest(a);
        System.out.println( " Largest element is " +max);

    }
    static int isLargest( int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
            max=arr[i];
        }
        return max;
    }
}