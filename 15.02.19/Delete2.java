  /* without method delete word */
  import java.util.Scanner;
  public class Delete2{
      public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
          System.out.println(" Enter a sentance");
          String str=sc.nextLine();
          System.out.println(" Enter a word");
          String word=sc.nextLine();
          isDelete( str,word);
      }
      static  void  isDelete( String s1,String s2) {
          String st="";
          for(int i=0;i<s1.length();i++){
              for( int j=0;j<s2.length();j++){
                  if(s1.charAt(i)!=s2.charAt(j)){
                      st=st +s1.charAt(i);
                  }
              }
          }
          System.out.println(st);
      }
  }