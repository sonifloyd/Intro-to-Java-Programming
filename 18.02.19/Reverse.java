/*   */
import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter size of array");
        int len =sc.nextInt();
        int []  arr=new int[len];
        System.out.println(" enter array of element");
        int j,i;
        for(  i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        for( j=len-1;i>=0;j--){
            System.out.println(" Reverse array element is" +arr[j]);
        }
           
    }
}