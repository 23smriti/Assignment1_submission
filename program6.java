import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int t=n;
        int number=0;
        n=t;
       while(n!=0)
       {
           int digit=n%10;
           number=number*10+digit;
           n=n/10;
       }
       
        
        if(number==t)
        System.out.println("True");
        else
        System.out.println("False");

    }
}
/* input: 343 
output:True   
input:441 
output: False
*/
