package BankAccount;

public class SavingAccount extends bankAccount {
	int AcNo;
	String Name;
	int blance = 0;
	@Override
	public void deposit(int AcNo, String Name, int blance) {
		// TODO Auto-generated method stub
		this.AcNo = AcNo;
		this.Name = Name;
		this.blance += blance;
		System.out.println("Deposit\nAC NO: "+AcNo+"\nBalance : "+blance);
	}

	

	@Override
	public void withdraw(int AcNo, int Amount) {
		// TODO Auto-generated method stub
		
//		this.Name = Name;
//		System.out.println("Balance :"+this.blance);
		if(Amount < this.blance) {
			this.blance -= Amount;	
			System.out.println("\n\nWithdraw:\nAC NO: "+AcNo+"\nWithdraw Amount : "+Amount+"Balance : "+blance);
			
		}
		else {
			System.out.println("Not is less than "+this.blance);
		}
		
	
	}
	
}
