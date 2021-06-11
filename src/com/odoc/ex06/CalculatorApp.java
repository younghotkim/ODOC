package com.odoc.ex06;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫번째 숫자: ");
		int inputx = sc.nextInt();

		System.out.print("두번째 숫자: ");
		int inputy = sc.nextInt();
		
		Calculator num1 = new Calculator(inputx,inputy);
		
		System.out.println(num1.plus());
		
		System.out.println(num1.toString());
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
