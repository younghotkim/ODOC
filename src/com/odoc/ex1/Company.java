package com.odoc.ex1;

public class Company {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("김영하",31,"남","서울시",9000);
		Employee e2 = new Employee("정우성",45,"남","부산시",4000);
		Employee e3 = new Employee("제니",23,"여","제주시",3000);
		
		Manager m1 = new Manager("유재석",48,"남","대전시", 10000, "해외영업팀");
		
		Employee[] mem = new Employee[3];
		mem[0] = e1;
		mem[1] = e2;
		mem[2] = e3;
		
		for(int i=0;i<mem.length;i++) {
			
			mem[i].showInfo();
			
		}
		
		m1.showInfo();

	}

}
