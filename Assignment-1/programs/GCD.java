import java.util.Scanner;
class GCD{
	public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	 int a=sc.nextInt();
	 int b=sc.nextInt();
     int c=0,GCD=0;
	 if(a==b)
	 System.out.println(a+"is GCD of a,b");
     else if (a<b)
		 c=a;
	 else
		 c=b;
	 for(int i=1;i<=c;i++)
	 {
		 if(a%i==0 && b%i==0)
		 {
			GCD=i; 
		 }
	 }
	 System.out.println(GCD);	 
	}
}