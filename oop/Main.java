class Main {
  public static void main(String[] args) {
    System.out.println("Mini Banking App!");

    Bank bank = new Bank("Griffith", "3232323232");

    bank.deposit(25);
    bank.withdraw(3000);
    System.out.println(bank.getBalance());

    Barclays barclaysBank = new Barclays("Griff");
    barclaysBank.getBankName();
  }


}