public class BankAccount {
    private String accountNumber = "1234567";
    private double balance = 0.0;
    private String accountType = "Nomal";
    private String customerName = "John Doe";
    private String customerEmail = "john.doe@gmail.com";
    private String customerPhone = "123456789";

    public void setAccountNumber(String  accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void Deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + " to " + accountNumber + ". Your account balance is " + balance+ ".");
    }

    public void Withdraw(double withdrawAmount) {
        if (this.balance - withdrawAmount <0) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("balance");
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

}
