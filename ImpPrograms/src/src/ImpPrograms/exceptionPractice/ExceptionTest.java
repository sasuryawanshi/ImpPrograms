package ImpPrograms.exceptionPractice;

public class ExceptionTest {

	public void m() throws IndexOutOfBoundsException {
		System.out.println("This is Parent M");
	}
}

class ThrowException extends ExceptionTest {
	public void m() throws ArrayIndexOutOfBoundsException{
		System.out.println("This is Child M");
	}
	public static void main(String[] args) {
		ThrowException t = new ThrowException();
		t.m();
	}
}