import javax.lang.model.util.ElementScanner6;

/*
            *
        
          * * 
        *  * * 
     *  * * * 

     * * * * *
*/
public class Main4{
  public static void main(String[] args) {
    isPrint();
    
  }
 static  void isPrint(){
   int n=5;
   for(int i=1;i<=n;i++){
     for(int j=1;j<=n;j++){
       if(j>=6-i)
       System.out.print("x"+"");
       else
       System.out.print(" ");
     }
     System.out.println();
   }

  }
}  