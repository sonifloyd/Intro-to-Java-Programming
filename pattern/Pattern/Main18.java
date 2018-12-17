
/*
A B C D E
A B C D E 
A B C D E 
A B C D E
A B C D E
*/
public class Main18{
    public static void main(String[] args) {
        isPrint();
    }
    static void isPrint(){
        int n=5;                  // ASCII value of A-Z =(65-90) or (a-z)=97-122 or digit (0-9)=(48-57)

          for(int i=1;i<=n;i++){   
              for(int j=1;j<=n;j++){
                  System.out.print(char(j+64) + " ");
              }
              System.out.println();
          }
      }
  }
