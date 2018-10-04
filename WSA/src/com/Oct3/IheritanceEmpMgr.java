package com.Oct3;

class Employee2{
	float salary=10000;
}
class Manager extends Employee2{
	int bonus = 10000;
}

public class IheritanceEmpMgr {

	public static void main(String[] args) {
		
		Manager a1 = new Manager();
		Employee2 e1 = new Employee2();
		
		System.out.println("manager Salry"+e1.salary);
		System.out.println("manager bonus "+a1.bonus);
		
	}

}
