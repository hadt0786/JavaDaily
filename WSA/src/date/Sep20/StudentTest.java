package date.Sep20;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		String n;
		int x, y;
		
		Student s = new Student();
		Scanner cin = new Scanner(System.in);
		System.out.println("enter name");
		n = cin.next();
		
		System.out.println("Enter Marks1");
		x = cin.nextInt();
		
		System.out.println("Enter marks2");
		y = cin.nextInt();
		s.Result(n,x,y);
		
	}

}

class Student {
	String name;
	int m1, m2;
	float t, av;
	
	void Result(String n, int a, int b) {
		name = n;
		m1 = a ;
		m2 = b;
		t = m1+m2;
		av = t/2;
		System.out.println("Name "+name);
		System.out.println("total "+t);
		System.out.println("Average Marks "+av);
	}
}
