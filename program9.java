import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=-1,b=1,c=0;
        for(int i=0;i<n;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
     }
}
/* input:10 
output:0 1 1 2 3 5 8 13 21 34*/
