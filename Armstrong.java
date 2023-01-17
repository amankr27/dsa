import java.util.*;
public class Armstrong {
    static int arms(int n)
    {
        int temp=n;
        int res=0;
        while(temp!=0)
        {
            int rem=temp%10;
            res=res+rem*rem*rem;
            temp=temp/10;
        }
        if(res==n)
        {
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        arms(n);
    }
}
