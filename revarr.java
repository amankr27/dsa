public class revarr {
     /**
     * @param a
     * @param idx
     */
    static void rev(int []a, int idx)
    {
        int i=0;
        int j=a.length-1;
        while(i<=j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
     static void display(int a[])
        {
            for(int i=0; i<a.length; i++)
            {
                System.out.print(a[i]+ " ");
            }
        }
    }
}
