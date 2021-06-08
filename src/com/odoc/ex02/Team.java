package com.odoc.ex02;

public class Team {
	
	protected String teamLeague;
	protected String teamName;
	
	public Team() {
		
	}
	
	public Team(String teamLeauge, String teamName) {
		
		this.teamLeague = teamLeauge;
		this.teamName = teamName;
		
	}
	
	public String getTeamLeague() {
		return teamLeague;
	}
	public void setTeamLeague(String teamLeague) {
		this.teamLeague = teamLeague;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	
	
	
	
	
	
}
