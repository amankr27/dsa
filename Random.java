package sep23;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=5;
          int sum=0;
          int t=0;
          
          for(int i=1; i<=n; i++)
          {
        	  
        	  //System.out.print("1");
        	  for(int j=1; j<=i; j++)
        	  {
        		  System.out.print(j);
        		  if(j!=i)
        		  {
        			  System.out.print("+");
        		  }	  
        	  }
        	  sum += i;
        	  System.out.println("="+sum);
        	  t +=sum;
        	     }
          System.out.println("sum of above series is="+t);
	}

}
