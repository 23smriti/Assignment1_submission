import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t=scn.nextInt();
       int i,j,c=0;
       for(i=1;i<=t;i++)
       {
           int n=scn.nextInt();
           c=0;
           for(j=1;j*j<=n;j++)
           {
               if(n%j==0)
                  c+=1;
               
           }
           if(c==1)
                System.out.println("true");
           else
               System.out.println("false");
           
       }
  }
  }
