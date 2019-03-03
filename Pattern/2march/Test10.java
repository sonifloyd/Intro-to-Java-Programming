/*   1 
     2 3 
     4 5 6
     7 8 9 10
    */
    public class Test10{
        public static void main(String[] args) {
            int k=1;
            for(int i=1;i<=4;i++){
                for(int j=1;j<=4;j++){
                    if(j<=i){
                    System.out.print(k +" ");
                    k++;}
                    else
                    System.out.print(" ");
                    
                    
                    
                }
                System.out.println();
                
            }
        }
    }