

/*
A B C D E
F G H I J 
K L M N O
P Q R S T
U V W X Y
*/public class Main26{
    public static void main(String[] args) {
        isPrint();
    }
    static void isPrint(){
        int n=5,k=1;                  

          for(int i=1;i<=n;i++){ 
                
              for(int j=1;j<=n;j++){
                  
                  System.out.print(char(k+64));
                  k++;
                  
                  
              }
              System.out.println();
          }
      }
  }