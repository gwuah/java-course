class Main {
	public static void main(String[] args) {

		char switchValue = "A";

		switch(switchValue) {
			case "A" :
				print("Value A");
				break;

			default :
				print("Not Matched")
		}
		
	}

	public static void print(String output) {
		System.out.println(output);
	}
}