package BankAccount;

public class CallBankAccount {
	public static void main(String[] args) {
		SavingAccount save = new SavingAccount();
		save.deposit(1200000,"Dhruv Patel",5000000);
//		System.out.println(save);
		save.withdraw(122323,12);
//		System.out.println(save);
	}
}
