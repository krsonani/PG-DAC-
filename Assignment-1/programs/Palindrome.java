import java.util.Scanner;
class Palindrome{
	public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt();
	 int n1=n;
	 int N=0;
	 
	 for(int i=1;n>0;i++)
	 {
		 N=N*10+n%10;
		 n=n/10;
	 }
	 if(n1==N)
	 System.out.println(N+" is palindrome number");
     else
		 System.out.println(N+" is not palindrome number"); 
	 
	}
}