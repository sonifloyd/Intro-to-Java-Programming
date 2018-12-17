/*
      A1      
     AB12     
    ABC123    
   ABCD1234   
  ABCDE12345  
 ABCDEF123456 
ABCDEFG1234567
*/
public class Main27{
    public static void main(String[] args) {
        
    
isPrint();
}
static void isPrint(){
                  

      for(int i=1;i<=7;i++){ 
            
          for(int j=1;j<=14;j++){
              if(j<=7)
              
              System.out.print(char(j+64)+"");
              else
              System.out.print(j+"");
            
              
              
          }
          System.out.println();
      }
  }
}
