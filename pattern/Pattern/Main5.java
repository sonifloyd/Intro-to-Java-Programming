


/*

* * * * *
  * * * *
    * * *
      * *
        *

        */

    public class Main5{
        public static void main(String[] args) {
            isPrint();
            
        }
       static void isPrint(){
           int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j>=i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
      } 
        
    }    