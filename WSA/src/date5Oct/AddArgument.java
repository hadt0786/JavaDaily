package date5Oct;

public class AddArgument {
	public static void main(String args[]) {
		int sum = 0;
		for (String arg : args) {
			sum += Integer.parseInt(arg);
		}
		System.out.println("Sum = " + sum);
	}
}