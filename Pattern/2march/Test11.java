/*  1 * 2 * 3
    1 * 2 * 3
    1 * 2 * 3
    1 * 2 * 3
    1 * 2 * 3 

*/
public class Test11{
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){
            int k=1;
            for(int j=1;j<=5;j++){
                if(j%2==0)
                System.out.print("*" +" ");
                
                else{
                System.out.print(k+" ");
                k++;}
                
                
                
            }
            System.out.println();
            
        }
    }
}