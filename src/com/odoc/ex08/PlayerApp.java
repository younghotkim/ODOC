package com.odoc.ex08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PlayerApp {

	public static void main(String[] args) throws IOException {
		
		//파일을 읽는다 한줄씩!!
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\player.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<Player> pList = new ArrayList<Player>();
		
		while(true) {
			
			String line = br.readLine();
			
			if(line == null) {
				break;
			}
			
			String[] pInfo = line.split(" ");
			
			String playerName = pInfo[0];
			String playerAge = pInfo[1];
			String playerNationality = pInfo[2];
			String playerTeam = pInfo[3];
			String playerPosition = pInfo[4];
			
			Player p = new Player(playerName, playerAge, playerNationality, playerTeam, playerPosition);
			
			pList.add(p);
			
		}
		
		for ( int i=0; i<pList.size(); i++) {
			
			pList.get(i).showInfo();
			
		}
		
		br.close();
		
		Player p2 = new Player("손흥민", "28", "대한민국", "토트넘", "FW");
		
		pList.add(p2);
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\new_player_list.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		System.out.println("===================New===List========================");
		
		for ( int i=0; i<pList.size(); i++) {
			
			bw.write( pList.get(i).toString() );
			bw.newLine();
			
		}
		
		
		bw.close();
		
		
		
	}

}
