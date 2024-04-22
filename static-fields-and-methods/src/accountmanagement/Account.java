package accountmanagement;



public class Account {

    private static int accountCount = 0;

    private long accountNo;
    private String customerName;
    private double balance;

    public static int getObjectCount() {
        return accountCount;
    }

    public Account(long accountNo, String customerName, double balance) {
        accountCount+=1;
        setAccountNo(accountNo);
        setCustomerName(customerName);
        setBalance(balance);
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        if (balance>0 ){
            balance += amount;
        }
        else{
            System.out.println("Balance is low");
        }
    }

    public void showAccountInfo(){
        System.out.println("Account Number : "+accountNo+"\nCustomer Name : "+customerName+"\nBalance : "+balance);
    }

}
