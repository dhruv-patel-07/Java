package BankAccount;

public class CurrentAccount extends bankAccount {
	int AcNo;
	String Name;
	int blance = 0;
	@Override
	public void deposit(int AcNo, String Name, int blance) {
		// TODO Auto-generated method stub
		this.AcNo = AcNo;
		this.Name = Name;
		this.blance += blance;
		System.out.println("AC NO: "+AcNo+"Balance : "+blance);
		
	}

	@Override
	public void withdraw(int AcNo, int Amount) {
		// TODO Auto-generated method stub
		this.AcNo = AcNo;
//		this.Name = Name;
		if(this.blance < Amount) {
			this.blance -= Amount;	
			System.out.println("AC NO : "+AcNo+"\n Withdraw Amount : "+Amount+"Balance : "+blance);
			
		}
		else {
			System.out.println("Not is less than "+this.blance);
		}
		
	
	}

}
