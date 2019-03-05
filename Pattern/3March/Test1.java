/*     1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1 */ 
  public class Test1{
      public static void main(String[] args) {
          for(int i=1;i<=4;i++)
          {
              int k=1;
              for(int j=1;j<=7;j++)
              {
                  if(j>=5-i  && j<=3+i)
                  {

                  
                  System.out.print(k+"");
                  
                    if(j<4)
                    k++;
                    else      //j<4 ?k++:k--;
                    k--;
                  }
                  else
                  System.out.print(" "); 
              }
              System.out.println();
          }
        }
  }