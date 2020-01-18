import java.util.*;

public class coins{
      public static void main(String[] args){
            Scanner s= new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n=s.nextInt();
            for(int i=1;i<=n;i++)
            {
                  for(int j=1;j<=i;j++)
                        System.out.print("$  ");
                  n=n-i;
                  System.out.print("\n");
            }
            for(int i=0;i<n;i++)
                  System.out.print("$  ");
            System.out.print("\n");
      }
}