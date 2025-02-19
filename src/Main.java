//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       BankAccount myBank = new BankAccount();

       myBank.setBalance(1000.22);
       myBank.setAccountNumber(2223344);
       System.out.println(myBank.getBalance());

    }
}

