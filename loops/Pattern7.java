package loops;
import java.util.*;
public class Pattern7 {
    
         public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter no. of column and row");
            int n=sc.nextInt();
            int m=sc.nextInt();
             
            for (int i =1;i<=n;i++)
            {                              
                for(int k=1;k<i;k++)
                {
                    System.out.print(" ");

                }
                for(int j=1;j<=m;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
         }

}
