package date.Sep20;

public class InitializeBeforUse {

	public static void main(String[] args) {

		Type2 c = new Type2();
		c.carSpeed();
		
		
	}

}

class Type2 {
	public void carSpeed() {
		long speed= 1L;
		System.out.println(speed);
	}
}

