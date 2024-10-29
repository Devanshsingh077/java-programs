package loops;
import java.util.*;
public class Pattern5 {
     public static void main(String[] args) {
        int num=2;

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int temp = num;
            for(int j=0;j<=i;j++)
            {
                System.out.print(temp);
                temp--;

            }
            if(i<n-1)
            {
                num=num+i+2;
                System.out.println();
            }
            else{
                break;
            }
        }
        System.out.println();
        for(int i=n-1;i>=0;i--)
        {
            int temp=num;
            for(int j=i;j>=0;j--)
            {
                System.out.print(temp);
                temp--;
            }
            num=num-(i+1);
            System.out.println();
        }
    }
    
}


