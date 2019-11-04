class Barclays extends Bank {
	public Barclays(String name) {
		super(name, generateAccountNumber());
	}

	public String generateAccountNumber() {
		return "0343400000";
	}

	public void getBankName() {
		System.out.println("Barclays Commercial Bank (LMAO)");
	}
}