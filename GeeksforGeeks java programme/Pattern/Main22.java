/*

1 * 2 * 3
1 * 2 * 3
1 * 2 * 3
1 * 2 * 3
1 * 2 * 3
*/
public class Main22{
    public static void main(String[] args) {
        isPrint();
    }
    static void isPrint(){
        int n=5;                  

          for(int i=1;i<=n;i++){ 
              int k=1;  
              for(int j=1;j<=n;j++){
                  if(j%2==0){
                  System.out.print("*" + " ");}
                  else{
                  System.out.print(k+" ");
                  k++;}
                  
                  
              }
              System.out.println();
          }
      }
  }