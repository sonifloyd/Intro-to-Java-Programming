

/* 
   1 1 1 1 1
   0 0 0 0 0 
   1 1 1 1 1
   0 0 0 0 0 
   1 1 1 1 1
   */
  public class Main17{
    public static void main(String[] args) {
        isPrint();
    }
    static void isPrint(){
        int n=5;
          for(int i=1;i<=n;i++){
              for(int j=1;j<=n;j++){
                  System.out.print(i%2 + " ");
              }
              System.out.println();
          }
      }
  }

    
