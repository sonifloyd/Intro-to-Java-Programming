/*   */
 public class Test8{
     public static void main(String[] args) {
         String name ="Raj";
         int i=0;
         int j;
         for(i=0;i<=name.length();i++){
             System.out.println(name.substring(0, i));
         }
         for(j=name.length()-1;j>=0;j--){
             System.out.println(name.substring(0,j));
         }
     }
 }