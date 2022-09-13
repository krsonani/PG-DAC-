class P9{
	public static void main(String args[]){
		for(int i=1;i<=10;i++)
		{
			if (i<6)
			{
				for(int k=4;k>=i;k--)
				{
				System.out.print(" ");	
				}
				for(int j=1;j<=i;j++)
			   {
				System.out.print("*");
			   }
			}
			else
			{
				for(int k=4;k<=i-2;k++)
				{
				System.out.print(" ");	
				}
				for(int j=1;j<=10-i;j++)
			   {
				System.out.print("*");
			   }
			}
			System.out.println();
		}
	}
}