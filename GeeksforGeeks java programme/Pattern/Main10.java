

/*
* * * * * * * 
  * * * * *
    * * *
      *
    * * *
  * * * * *
* * * * * * *

*/
public class Main10{
    public static void main(String[] args) {
      isPrint();

        
    }
    static void isPrint(){
        int n=7,k=0,c;
        for(int i=1;i<=n;i++){
           if(i <= 4){
             k++ ;
           }
             else { k--;}
            for(int j=1;j<=n;j++){
                if(j>=k && j<=8-k)
                System.out.print("*" + "");
                else
                System.out.print(" ");

            }
            System.out.println();
        }
    }
    
}