package com.odoc.ex03;

public class ListApp {

	public static void main(String[] args) {
		
		Team p1 = new Player("EPL","토트넘","손흥민",28,"대한민국","FW");
		Team p2 = new Player("세리에A","유벤투스","호날두",35,"포르투갈","FW");
		Team p3 = new Player("라리가","바르셀로나","메시",33,"아르헨티나","FW");
		Team p4 = new Player("EPL","첼시","캉테",29,"프랑스","MF");
		Team p5 = new Player("리그1","PSG","음바페",22,"프랑스","FW");
		
		Team[] list = new Team[5];
		
		list[0] = p1;
		list[1] = p2;
		list[2] = p3;
		list[3] = p4;
		list[4] = p5;
		
		for (int i=0; i<list.length; i++) {
			
			list[i].showInfo();
			
		}
		
		// >> 섞어쓰기 <<
		
		
		
		
		
		
		
		
		
		

	}

}
