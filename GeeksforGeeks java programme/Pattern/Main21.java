
/*
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
*/
public class Main21{
    public static void main(String[] args) {
        isPrint();
    }
    static void isPrint(){
        int n=5,k=1;                  // ASCII value of A-Z =(65-90) or (a-z)=97-122 or digit (0-9)=(48-57)

          for(int i=1;i<=n;i++){   
              for(int j=1;j<=n;j++){
                  System.out.print(k%2 + " ");
                  k++;
              }
              System.out.println();
          }
      }
  }