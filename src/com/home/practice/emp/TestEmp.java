package com.home.practice.emp;

public class TestEmp {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Siddarth", "Sharma", -23000);
		Employee emp2 = new Employee("Sabaree", "Mahadev", -20000);
		
		System.out.println("Name : "+emp1.getFirstName()+" "+emp1.getLastName());
		System.out.println("Monthly Sal: "+emp1.getMonthlySalary());
		System.out.println("Yearly Sal : "+emp1.getYearlySalary(emp1.getMonthlySalary()));
		
		System.out.println("Name : "+emp2.getFirstName()+" "+emp2.getLastName());
		System.out.println("Monthly Sal: "+emp2.getMonthlySalary());
		System.out.println("Yearly Sal : "+emp2.getYearlySalary(emp2.getMonthlySalary()));
		
		System.out.println("After 10 % raise..........");
		
		emp1.setMonthlySalary(0.1 * emp1.getMonthlySalary()+emp1.getMonthlySalary());
		emp2.setMonthlySalary(0.1 * emp2.getMonthlySalary()+emp2.getMonthlySalary());
		
		System.out.println("Name : "+emp1.getFirstName()+" "+emp1.getLastName());
		System.out.println("Monthly Sal: "+emp1.getMonthlySalary());
		System.out.println("Yearly Sal : "+emp1.getYearlySalary(emp1.getMonthlySalary()));
		
		System.out.println("Name : "+emp2.getFirstName()+" "+emp2.getLastName());
		System.out.println("Monthly Sal: "+emp2.getMonthlySalary());
		System.out.println("Yearly Sal : "+emp2.getYearlySalary(emp2.getMonthlySalary()));
		
	}
}
