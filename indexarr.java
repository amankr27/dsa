import java.util.*;
public class indexarr {
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int size=scn.nextInt();
        int n[]= new int[size];
        for(int i=0; i<size; i++)
        {
            n[i]=scn.nextInt();
        }
        int x=scn.nextInt();
        for(int i=0; i<n.length; i++)
        {
            if(n[i]==x)
            {
                System.out.println("index is:" + i);
            }
        }
    }
}
