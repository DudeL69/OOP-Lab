import java.util.*;

public class digit{
      public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            int n;
            int digit[]=new int[10];
            System.out.print("Enter the three numbers: ");
            for(int i=0;i<3;i++)
            {
                  n=s.nextInt();
                  digit[n%10]++;
            }
            for(int i=0;i<10;i++)
                  if(digit[i]>=2)
                  {
                        System.out.print("true");
                        break;
                  }
      }
}