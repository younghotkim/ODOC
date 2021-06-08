package com.odoc.ex01;

public class Employee {
	
	private String name;
	private int age;
	private String sex;
	private String adr;
	private long salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, String sex, String adr, long salary) {
		
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.adr = adr;
		this.salary = salary;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public double bonus() {
	
		return salary*1.5;
		
	}	
	
	public void showInfo() {
		
		System.out.println("==========================");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("성별: " + sex);
		System.out.println("주소: " + adr);
		System.out.println("급여: " + salary);
		System.out.println("보너스: " + this.bonus());
		
	}
}
	
