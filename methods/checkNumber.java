class Main {
	public static void main(String[] args) {
		print("Check Number Program");

		checkNumber(24);
		checkNumber(19);
		checkNumber(-1);
		checkNumber(0.4);

	}

	public static void print(String output) {
		System.out.println(output);
	}

	public static void checkNumber(int num) {
		if (num < 0) {
			print("Negative Number");
		} else if (num > 0) {
			print("Positive Number");
		} else {
			print("Zero")
		}
	}
}