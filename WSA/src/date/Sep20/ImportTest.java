package date.Sep20;

import java.util.*;

public class ImportTest {

	public static void main(String[] args) {

		PrintDate d = new PrintDate();
		d.printDate();
		
	}
	
}

class PrintDate{
	public void printDate() {
		Date d = new Date();
		System.out.println(d);
	}
}
