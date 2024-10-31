package loops;
import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row an column");
        int row=sc.nextInt();
        int column=sc.nextInt();

        for (int i=1;i<=row;i++)
        {
            for(int j=1;j<=column;j++)
            {
                if(i==1 || i==row)
                
                {
                    System.out.print("*");

                   
                }
                else
                {
                    System.out.print("*");
                    for(int k=2;k<=column-1;k++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    break;

                }
            }
            System.out.println();
        }
    }
}
