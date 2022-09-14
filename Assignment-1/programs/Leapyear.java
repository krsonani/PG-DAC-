import java.util.Scanner;
class Leapyear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if(n%400==0)
		System.out.println(n+" is leap year");	
		else if(n%4==0)
		System.out.println(n+" is leap year");
	    else
		System.out.println(n+" is not leap year");
	}
}