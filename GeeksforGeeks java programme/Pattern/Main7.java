

/*

1 1 1 1 1 
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

*/
public class Main7{
    public static void main(String[] args) {
        isPrint();
    }
    static void isPrint(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+"");
            }
            System.out.println();
        }
    }
}

