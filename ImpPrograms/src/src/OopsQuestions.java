public class OopsQuestions {

	void print(int i, double j) {
		System.out.println("Hi");

	}

	void print(double i, int j) {
		System.out.println("Hello");
	}

	// Ambiguity error compiler don't know which method to call
	public static void main(String[] args) {
		OopsQuestions p = new OopsQuestions();
		//p.print(10, 10);
	}

}
