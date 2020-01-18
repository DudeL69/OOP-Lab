import java.util.*;

public class oddeven{
      public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            System.out.print("Enter the number of array elements: ");
            int n=s.nextInt();
            int arr[]=new int[n];
            System.out.print("Enter the array elements: ");
            for(int i=0;i<n;i++)
                  arr[i]=s.nextInt();
            int temp;
            for(int i=0;i<n-1;i++)
                  for(int j=0;j<n-i-1;j++)
                        if((arr[j]%2==0)&&(arr[j+1]%2==1))
                        {
                              temp=arr[j];
                              arr[j]=arr[j+1];
                              arr[j+1]=temp;
                        }
            System.out.print("The rearranged array is:\n");
            for(int i=0;i<n;i++)
                  System.out.print(arr[i]+"  ");
      }
}