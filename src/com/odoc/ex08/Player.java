package com.odoc.ex08;

public class Player {
	
	private String playerName;
	private String playerAge;
	private String playerNationality;
	private String playerTeam;
	private String playerPosition;
	
	public Player () {
		
	}
	
	public Player(String playerName, String playerAge, String playerNationality, String playerTeam,
			String playerPosition) {
		
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.playerNationality = playerNationality;
		this.playerTeam = playerTeam;
		this.playerPosition = playerPosition;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(String playerAge) {
		this.playerAge = playerAge;
	}
	public String getPlayerNationality() {
		return playerNationality;
	}
	public void setPlayerNationality(String playerNationality) {
		this.playerNationality = playerNationality;
	}
	public String getPlayerTeam() {
		return playerTeam;
	}
	public void setPlayerTeam(String playerTeam) {
		this.playerTeam = playerTeam;
	}
	public String getPlayerPosition() {
		return playerPosition;
	}
	public void setPlayerPosition(String playerPosition) {
		this.playerPosition = playerPosition;
	}
	
	public void showInfo() {
		
		System.out.println("#선수명: " + this.playerName + " #나이: " + this.playerAge + " #국적: " + this.playerNationality
				+ " #소속팀: " + this.playerTeam + " #포지션: " + this.playerPosition);
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", playerAge=" + playerAge + ", playerNationality="
				+ playerNationality + ", playerTeam=" + playerTeam + ", playerPosition=" + playerPosition + "]";
	}

}
