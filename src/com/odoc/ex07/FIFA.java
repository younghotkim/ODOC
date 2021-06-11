package com.odoc.ex07;

public class FIFA {

	public static void main(String[] args) {
		
		Son s18 = new Son("Son",18,87);
		Son s19 = new Son("Son",19,92);
		Son s20 = new Son("Super Son",20,96);
		
		
		
		System.out.println(s18.equals(s20));
		System.out.println(s19.equals(s20));
		System.out.println(s19.equals(s18));
		
		//equals메소드를 재정의하여 이름과 같은 시즌은 같다고 표시
		
		
		

	}

}
