import java.util.Scanner;
class ThreeDArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the blocks in array:");
		int blocks=sc.nextInt();
		System.out.print("enter the no of rows:");
		int row=sc.nextInt();
		System.out.print("enter the no of colomns:");
		int col=sc.nextInt();
		int a[][][]=new int[blocks][row][col];
		int i,j,k;

		for(i=0;i<=a.length-1;i++)
		{
			for(j=0;j<=a[i].length-1;j++)
			{
				for(k=0;k<=a[i][j].length-1;k++)
				{
					System.out.println("enter the array values");
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		System.out.println("**********************************array values are****************************************");

		for(i=0;i<=a.length-1;i++)
		{
			for(j=0;j<=a[i].length-1;j++)
			{
				for(k=0;k<=a[i][j].length-1;k++)
				{
				    System.out.print(a[i][j][k]+"   ");
				}
				System.out.println();
			}
			System.out.println("************");
		}

	}
}
