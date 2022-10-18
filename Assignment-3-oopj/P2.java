class Account{
	int accountNumber;
	String name;
	double balance;
	Account(int a,String n,double b)
	{
		accountNumber=a;
		name=name;
		balance=b;
	}
		void  calcaulateYearlyInterest()
	{
	
	}
}
class SavingAccount extends Account{
	double interestRate;
	
	SavingAccount(double r,int a,String n,double b)
	{
		super(a,n,b);
		interestRate=r;
	}
	void  calcaulateYearlyInterest()
	{
		System.out.println((balance*interestRate*1)/100);
	}
	
}
class CurrentAccount extends Account{
	
	CurrentAccount(int a,String n,double b)
	{
		super(a,n,b);
	}
}
class Manger{
	Account ac[];
	
	/*
	int i=0;
	void addSavingAccount()
	{
		ac[i]=new SavingAccount();
		i++;
		ac[i]=new SavingAccount();
	}
   void addCurrentAccount()
	{
		ac[i]=new CurrentAccount();
		i++;
	}*/
	void print()
	{
		for(int c=0;c<ac.length;c++)
		{
			System.out.println("--------------------");
			System.out.println("name:-"+ac[c].accountNumber);
			System.out.println("name:-"+ac[c].name);
			System.out.println("name:-"+ac[c].balance);
			System.out.println("--------------------");
		}
	}
	
	public static void main(String args[])
	{
		Manger m = new Manger();
		SavingAccount sa1= new SavingAccount(3.5,1,"krunal-sa-1",100000);
		SavingAccount sa2= new SavingAccount(3.5,2,"krunal-sa-2",200000);
		SavingAccount sa3= new SavingAccount(3.5,3,"krunal-sa-3",3000000);
		CurrentAccount ca1= new CurrentAccount(4,"krunal-ca-1",200000);
	    CurrentAccount ca2= new CurrentAccount(5,"krunal-ca-2",3000000);
		m.ac=new Account[]{sa1,sa2,sa3,ca1,ca2};
		sa1.calcaulateYearlyInterest();
		sa2.calcaulateYearlyInterest();
		sa3.calcaulateYearlyInterest();
		m.print();
	}
}