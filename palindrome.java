import java.util.*;
public class palindrome {
    static int pal(int n)
    {
        //int n=scn.nextInt();
        int temp=n;
        int rev=0;
        int rem;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(n==rev)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        pal(n);
       
    }
}
