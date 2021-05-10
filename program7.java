import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        int i=0,j=str.length()-1,flag=0;
       while(i<j)
       {
           if(str.charAt(i)!=str.charAt(j))
           {
              flag=1;
              break;
           }
           i++;
           j--;
       }
       if(flag==1)
       System.out.println("False");
       else
       System.out.println("True");
     }
}
/*input:abba 
output:True, 
input: abc
output:False
*/
