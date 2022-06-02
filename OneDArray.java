import java.util.Scanner;
class OneDArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
               int size=sc.nextInt();       int a[]=new int[size];
		for(int i=0;i<=size-1;i++)
		{
			System.out.println("enter the array element:");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
           System.out.println(a[i]);
		}
	}
}
