import java.util.Scanner;
class Primefactor{
	public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt();
	 for(int i=1;i<=n;i++)
	 {
		 if(n%i==0)
		 {
			 int j;
			 for(j=2;j<i;j++)
			 if(i%j==0)
		     break;
			 if(j==i)
			 {
				 System.out.println(i);
				  n=n/i;
				  i=1;
			 }
		 }
		
	 }
	
	}
}