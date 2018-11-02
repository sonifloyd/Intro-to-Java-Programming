/*
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
*/
public class Main25{
    public static void main(String[] args) {
        isPrint();
    }
    static void isPrint(){
        int n=5,k=1;                  

          for(int i=1;i<=n;i++){ 
        
              for(int j=1;j<=n;j++){
                  
                  System.out.print(k%2+" ");
                  
                  k++;
                  
              }
              System.out.println();
          }
      }
  }
