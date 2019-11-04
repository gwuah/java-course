class Barclays extends Bank {
	private String accountNumber = "2323232";
	public Barclays(String name) {
		super(name, accountNumber);
	}

	public String generateAccountNumber() {
		return this.accountNumber;
	}

	public void getBankName() {
		System.out.println("Barclays Commercial Bank (LMAO)");
	}

	@Override
	public double getBalance() {
		return super.getBalance() + 10;
	}
}