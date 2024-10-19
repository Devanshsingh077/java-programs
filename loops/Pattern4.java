package loops;

public class Pattern4 {
    public static void main(String[] args) {
        int a;

        for ( int i = 4; i >= 1; i--)
        {
	        if (i % 2 == 0)
	        {
	            a = (i * (i + 1)) / 2;
	            for (int j = 1; j <= i; j++)
	            {
		            System.out.print (a--);
	            }
	        }
	        else
	        {
	            a = (i * (i - 1)) / 2 + 1;
	            for( int j = 1; j <= i; j++)
	            {
		            System.out.print (a++);
	            }
	        }
	        System.out.println ();
        }
    }
}
            
        
    
    

