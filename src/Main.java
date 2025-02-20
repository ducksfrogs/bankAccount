//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       BankAccount myBank = new BankAccount();

       myBank.setAccountNumber("223344");
       myBank.setBalance(500.0);
       myBank.setCustomerName("John Doe");
       myBank.setCustomerEmail("john.doe@gmail.com");

       myBank.Deposit(100);
       myBank.Withdraw(500);

       System.out.println("Your bank account is " + myBank.getAccountNumber() +". And your balance is " + myBank.getBalance());

    }
}

