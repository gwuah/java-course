class Main {
  public static void main(String[] args) {
    System.out.println("Mini Banking App!");

    Bank bank = new Bank("Griffith Awuah", "000003434000434");

    bank.deposit(25);
    bank.withdraw(3000);
    System.out.println(bank.getBalance());
  }
}