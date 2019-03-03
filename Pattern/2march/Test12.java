/*  1 * 2 * 3
    4 * 5 * 6
    7 * 8 * 9
    1 * 2 * 3
    4 * 5 * 6 
 */
public class Test12{
    public static void main(String[] args) {
        int k=1;
        for(int i=1;i<=5;i++){
            
            for(int j=1;j<=5;j++){
                if(j%2==0)
                System.out.print("*" +" ");
                
                else{
                System.out.print(k+" ");
                k++;
                   if(k==10)
                     k=1;}
                
                
                
            }
            System.out.println();
            
        }
    }
}