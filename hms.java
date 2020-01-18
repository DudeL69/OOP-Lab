import java.util.*;

public class hms {
      public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.print("Enter the time in seconds: ");
      int t=s.nextInt();
      int temp=t;
      String h=String.format("%02d",temp/3600);
      temp=temp%3600;
      String min=String.format("%02d",temp/60);
      String sec=String.format("%02d",temp%60);
      System.out.println(h+":"+min+":"+sec+".");
      }
}