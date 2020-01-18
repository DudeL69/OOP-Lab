import java.util.*;

public class tdarray{
      public static void main(String[] args){
            Scanner s= new Scanner(System.in);
            System.out.print("Enter the order of the matrix: ");
            int m = s.nextInt();
            int n = s.nextInt();
            int mat[][]=new int[m][n];
            int flag=1;
            System.out.print("Enter the "+m*n+" elements in increasing order:\n");
            for(int i=0;i<m;i++)
                  for(int j=0;j<n;j++)
                        mat[i][j]=s.nextInt();
            System.out.print("Enter the key to be searched: ");
            int key=s.nextInt();
            for(int i=0;i<m;i++)
                  for(int j=0;j<n;j++)
                        if(mat[i][j]==key)
                        {
                              int k=i+1,l=j+1;
                              System.out.print("The element "+key+" is found at row "+k+" and column "+l+".");
                              flag=0;
                              break;
                        }
            if(flag==1)
                        System.out.print("Element "+key+" not found in the 2-D array...");
      }
}