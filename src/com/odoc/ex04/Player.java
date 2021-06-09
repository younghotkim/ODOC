package com.odoc.ex04;

public class Player extends Team{
	
	private String playerName;
	private int age;
	private String nationality;
	private String position;
	
	public Player () {
	}
	
	public Player(String leagueName, String teamName, int ranking, String star, String playerName, int age, String nationality, String position) {
		super(leagueName, teamName, ranking, star);
		this.playerName = playerName;
		this.age = age;
		this.nationality = nationality;
		this.position = position;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", age=" + age + ", nationality=" + nationality + ", position="
				+ position + ", leagueName=" + leagueName + ", teamName=" + teamName + ", ranking=" + ranking
				+ ", starPlayer=" + star + "]";
	}

	public void showInfo() {
		
		System.out.println("리그명: " + leagueName +  " 소속팀: " + teamName + " 순위: " + ranking + " 대표선수 :" + star
				+ " 선수명: " + playerName + " 나이: " + age + " 국적: " + nationality + " 포지션: " + position);
		System.out.println("=======================================================================================");
		
	}

}
