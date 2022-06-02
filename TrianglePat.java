class TrianglePat
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}

		System.out.println();
		}
//reverse triangle pattren
//System.out.println("************************************"); 
//above remove the comment lines you may see diffrent traingle pattern
       for(int i=1;i<=5;i++)
		{
		   for(int j=5;j>=i;j--)
			{
			   System.out.print("* ");  
			}
			System.out.println();
		}
	}
}
