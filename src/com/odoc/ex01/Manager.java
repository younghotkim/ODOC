package com.odoc.ex01;

public class Manager extends Employee {
	
	private String department;
	

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Manager() {
		
	}
	
	public Manager(String name, int age, String sex, String adr, long salary, String department) {
		
		super(name, age, sex, adr, salary);
		
		this.department = department;

	}
	
	public void showInfo() {
		
		System.out.println("==========================");
		System.out.println("이름: " + super.getName());
		System.out.println("나이: " + super.getAge());
		System.out.println("성별: " + super.getSex());
		System.out.println("주소: " + super.getAdr());
		System.out.println("급여: " + super.getSalary());
		System.out.println("보너스: " + super.bonus());
		System.out.println("부서: " + department);
		
	}
	
}
