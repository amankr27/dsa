import java.util.*;
public class Reverse {
   static int rev(int n)
    {  int s=0;
        while(n!=0)
       {
        int digit=n%10;
        s=(s*10)+digit;
        n=n/10;
       }
       return s;
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.print(rev(n));
    
    }
}
