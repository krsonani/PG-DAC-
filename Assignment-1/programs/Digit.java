import java.util.Scanner;
class Digit{
	public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt();
	 for(int i=0;n>0;i++)
	 {
		 System.out.println(n%10);
		 n=n/10;
	 }
	}
}