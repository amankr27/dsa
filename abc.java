import java.util.*;
public class abc
{
    static int factorial(int n)
    {
        if(n==0 || n==1)
          return 1;
        else
          return n*factorial(n-1);  
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int res=factorial(n);
        System.out.print(res);
    }
}
