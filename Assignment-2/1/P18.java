class P18{
	public static void main(String argc[]){
		int c=0;
		for(int i=5;i>=0;i--)             
		{
			
			for(int j=0;j<i;j++)        
			{
				
				int k= 65+j;
				System.out.print((char)k+" ");
			}
			System.out.println();
		}
	}
}