public class Account {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account() {
        this("99999", 111111.11, "default_name", "default_email", "default_ph_no");
        System.out.println("Empty Constructor Called");
    }

    public Account(String accountNumber, double balance, String custName, String custEmail, String custPhoneNumber) {
        System.out.println("Parameterised constructor is called!");
        this.accountNumber = accountNumber;
        this.balance = balance;
        name = custName;
        email = custEmail;
        phoneNumber = custPhoneNumber;
    }

    public Account(String name, String email, String phoneNumber) {
        this("99999", 111111.11, name, email, phoneNumber);
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositeAmount) {
        balance += depositeAmount;
        System.out.println("Deposite of $" + depositeAmount + "made. Available balance is $" + balance);
    }

    public void withdrawlFunds(double withdrawlAmt) {
        if(balance - withdrawlAmt < 0) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= withdrawlAmt;
            System.out.println("Withdrawl of $" + withdrawlAmt + "processed. Available balance is $" + this.balance);
        }
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

