import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
       int n=scn.nextInt();
       int t=n;
       int count=0;
        int sum=0;
      
       while(n!=0)
       {
           int digit=n%10;
           sum=sum+ fact(digit);
           n=n/10;
       }
       
        
        if(sum==t)
        System.out.println("True");
        else
        System.out.println("False");
     }
     public static int fact(int n)
     {
        if(n==0 || n==1)
        return 1;
         int fac=n*fact(n-1);
         return fac;
     }
  }
