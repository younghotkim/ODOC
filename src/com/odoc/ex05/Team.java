package com.odoc.ex05;

public abstract class Team {
	
	protected String leagueName;
	protected String teamName;
	protected int ranking;
	protected String star;
	
	public Team() {
	
	}
	
	public Team(String leagueName, String teamName, int ranking, String star) {
		
		this.leagueName = leagueName;
		this.teamName = teamName;
		this.ranking = ranking;
		this.star = star;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	
	@Override
	public String toString() {
		return "Team [leagueName=" + leagueName + ", teamName=" + teamName + ", ranking=" + ranking + ", starPlayer="
				+ star + "]";
	}

	public abstract void showInfo();
	
	
	
	
	
	
	
	
	

}
