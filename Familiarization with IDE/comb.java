import java.util.*;

public class comb{
      public static void main(String[] args){
            int a,b,c,d;
            int count=0;
            Scanner s= new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n=s.nextInt();
            for(a=0;a<=9;a++)
                  for(b=0;b<=9;b++)
                        for(c=0;c<=9;c++)
                              for(d=0;d<=9;d++)
                                    if((a+b+c+d)==n)
                                          count++;
            System.out.print("Total combinations= "+count+"\n");
      }
}