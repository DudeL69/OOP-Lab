import java.util.*;

public class tdarray{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int m,n;
		System.out.print("Enter the order of the matrix: ");
		m=s.nextInt();
		n=s.nextInt();
		int mat[][]=new int[m][n];
		System.out.print("Enter the elements of the matrix:\n");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				mat[i][j]=s.nextInt();
		System.out.print("Enter the element to be searched: ");
		int key=s.nextInt();
		int rindex=m+1,cindex=n+1;
		for(int i=0;i<m-1;i++)
		{
			if(key>=mat[i][0]&&key<mat[i+1][0])
			{
				rindex=i;
				break;
			}
		}
		for(int j=0;j<n;j++)
		{
			if(key==mat[rindex][j])
			{
				cindex=j;
				break;
			}
		}
		int row=rindex+1,col=cindex+1;
		if(cindex<n)
			System.out.print("Row: "+row+"\nCol: "+col+"\n");
	}
}
