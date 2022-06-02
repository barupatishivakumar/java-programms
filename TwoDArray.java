import java.util.Scanner;
class TwoDArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows:");
		int row=sc.nextInt();
		System.out.println("enter the no of col:");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.println("enter the col value :");
				a[i][j]=sc.nextInt();
			}
		}



		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
             System.out.print(a[i][j]);

			}
		}
	}
}
