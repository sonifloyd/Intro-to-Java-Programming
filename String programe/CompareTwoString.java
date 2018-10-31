
/* wAJP TO CAMPARE TWO STRING WITH USING PRE DEFINED METHOD*/
/*In String if u want to campare two sting then u can use compareTo()method*/

public class CompareTwoString{
    public static void main(String[] args) { 
        String s1="Banana";
        String s2="Ram" ;
        String s3="Banana";
        String s4="Man";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s4));
    }
} 
                                                      /* int compareTo(String str)                                                                                                                                                                                                                            
                                                     it retun integer value 
                                                      if it return 0 then both string are equal
                                                    if it return 1 then s1>s2
                                                       if it return -1 then s1<s2
                                                      where s1 and s2 are two string variable
                                                        example String s1="Aman"
                                                                String s2="Cman" then it compare each alphabet and 
                                                                 it gives its corresponding unicode and check which is bigger or small
                                                                 A unicode 65  and C unicode 67
                                                                  since all character are same only diff in A &C  so 65-67=(-2) it will return -2 value     
                                                           */