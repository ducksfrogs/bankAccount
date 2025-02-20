public class BankAccount {
    private String accountNumber = "1234567";
    private double balance = 0.0;
    private String customerName = "John Doe";
    private String customerEmail = "john.doe@gmail.com";
    private String customerPhone = "123456789";

    public BankAccount() {
        this("5678", 2.50, "default nama", "default email", "default phone");
        System.out.println("Bank Account Created");
    }

    public BankAccount(String number, double balance,  String name, String email, String phone) {
        System.out.println("Bank Account Created");
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = name;
        this.customerEmail = email;
        this.customerPhone = phone;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this("9999", 100.00, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

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

//    public String getAccountType() {
//        return accountType;
//    }

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
