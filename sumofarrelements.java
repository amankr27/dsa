import java.util.*;
public class sumofarrelements {
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
         int size=scn.nextInt();
         int a[]=new int[size];
         for(int i=0; i<size; i++)
         {
            a[i]=scn.nextInt();
         }
         int sum=0;
         int avg=0;
         sum= sumofarray(a);
         System.out.println("sum=" + sum);
         avg=avgofarray( sum,a);
         System.out.println("avg=" + avg);
    }
    static int sumofarray(int a[])
    {
        int sum=0;
        for(int i=0; i<a.length; i++)
        {
            sum +=a[i];
        }
        return sum;
    }
    static int avgofarray(int sum, int a[])
    {
        int avg=sum/a.length;
        return avg;
    }
    
}
