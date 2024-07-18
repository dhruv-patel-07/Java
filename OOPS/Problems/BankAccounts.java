public class BankAccounts {
    private BankCustomer cust;
    private double balance;
    public BankAccounts(BankCustomer cust, double balance) {
        this.cust = cust;
        this.balance = balance;
    }
    public BankCustomer getCust() {
        return cust;
    }
    public void setCust(BankCustomer cust) {
        this.cust = cust;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static void main(String[] args) {
        BankCustomer custmer = new BankCustomer("Dhruv","Patel");
        BankAccounts acc = new BankAccounts(custmer, 100000.0);
        System.out.println("First Name : "+custmer.getFirstName());
        System.out.println("Balance : "+acc.getBalance());
    }
}
