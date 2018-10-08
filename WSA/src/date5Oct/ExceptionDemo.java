package date5Oct;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			int data = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arthmatic exception " + e.getMessage());
		}
//		Exception in thread "main" java.lang.ArithmeticException: / by zero

		System.out.println("wsa");
	}

}
