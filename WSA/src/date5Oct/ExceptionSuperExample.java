package date5Oct;

public class ExceptionSuperExample {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[5] = (int)(30/0); // 30/0 -- > arithmetic exception
						// a[6] --> ArrayIndexOutOfBound Exception
						// Javac check the prioritty use the priroty level
						// First catch will only execute other will not exceute
		}

		catch (Exception e) {
			System.out.println("exception comes "+e.getClass());
		}
//		catch (ArithmeticException e) {
//			System.out.println("Arithmetic exception");
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array index out of bound");
//		}
		
		System.out.println("wsa");

		// output - Arithmetic Exception
		//wsa
		
	}

}
