class Bank {
  private double balance = 0;
  private String name;
  private String accountNumber;

  public Bank(String name, String accountNumber) {
    this.name = name;
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return this.balance;
  }

  public double deposit(double amount) {
    if (amount > 0) {
      this.balance += amount;
    }

    return this.balance;
  }

  public void withdraw(double amount) {
    if (this.balance - amount >= 0) {
      this.balance -= amount;
    } else {
      System.out.println("Insufficient Balance");
    }
  }
}