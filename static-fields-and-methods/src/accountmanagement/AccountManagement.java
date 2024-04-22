package accountmanagement;

public class AccountManagement {

    public static void main(String[] args) {

        // Create few accounts
        Account a1= new Account(12345,"Anuj",100000000);
        Account a2= new Account(56789,"Priya",20000000);
        Account a3= new Account(234567,"Mahi",5000000);


        // Display the no. of accounts created
        System.out.println("Accounts created: "+ Account.getObjectCount());
        // Do the basic operations(deposit/withdraw)
        a1.deposit(100000);
        a2.withdraw(27899);
        a3.withdraw(567889);

        a1.showAccountInfo();
        a2.showAccountInfo();
        a3.showAccountInfo();


    }

}
