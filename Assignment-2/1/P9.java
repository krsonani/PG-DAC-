class P9{
	public static void main(String argc[]){
		for(int i=1;i<=5;i++)             
		{
			for(int j=4;j>=i;j--)        
			{
			    System.out.print(" ");
			}
			for(int j=0;j<i;j++)        
			{
				int k= 65 +j;
				System.out.print((char)k+" ");
			}
			System.out.println();
		}
	}
}