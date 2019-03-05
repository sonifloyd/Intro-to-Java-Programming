/*   0
     0 1
     0 2 4
     0 3 6 9
     0 4 8 12 16 */
     public class TEst2{
        public static void main(String[] args) {
            for(int i=0;i<=4;i++)
            {
                int k=0;
                for(int j=0;j<=5;j++)
                {
                    if(j<=i){
               System.out.print(i*k+" ");
               k++;}
                    else
                    System.out.print(" "); 
                }
                System.out.println();
            }
          }
    }