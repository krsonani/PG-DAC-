class P16
{
	public static void main(String argc[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				if(( i==3 && j==2) ||(i==4 && (j==2 || j==3)))
				{
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}
}