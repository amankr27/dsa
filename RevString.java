import java.util.*;
public class RevString {
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        String name=scn.nextLine();
        //String name="aman";
        int l=name.length();
        String rev="";
        for(int i=l-1; i>=0; i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.print(rev);
    }
}
