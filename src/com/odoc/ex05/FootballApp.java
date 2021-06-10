package com.odoc.ex05;

public class FootballApp {

	public static void main(String[] args) {
		
		Team[] fm = new Team[4];
		
		Team t1 = new Player("EPL","토트넘",7,"케인","손흥민",29,"대한민국","FW");
		Team t2 = new Player("세리에","유벤투스",2,"디발라","호날두",35,"포르투갈","FW");
		Team c1 = new Coach("EPL","첼시",4,"캉테","투헬","48","프랑스");
		Team c2 = new Coach("라리가","레알마드리드",4,"벤제마","지단","42","프랑스");
		
		fm[0] = t1;
		fm[1] = t2;
		fm[2] = c1;
		fm[3] = c2;
		
		for (int i=0;i<fm.length;i++) {
			
			fm[i].showInfo();
			
		}
		
		Ballondor winner = new Player("EPL","토트넘",7,"케인","손흥민",29,"대한민국","FW");

		winner.award();
		
		
		
		
		
		
		
		
		
		

	}

}
