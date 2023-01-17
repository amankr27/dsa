import java.util.*;
public class Count {
    static int digit(int n){
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.print(digit(n));
    }
}
