package date5Oct;

//Multiple catch block Example
//Author :Sandhya
public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 4 / 4;
			System.out.println("a=" + a);
			String s = "abc";
			int i = Integer.parseInt(s);
			System.out.println("i=" + i);
		} catch (NumberFormatException e2) {
			System.out.println("number format error");
		} catch (ArithmeticException e1) {
			System.out.println("divide by zero");
		}
	}

}