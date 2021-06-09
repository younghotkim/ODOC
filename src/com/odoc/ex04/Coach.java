package com.odoc.ex04;

public class Coach extends Team {

	private String coachName;
	private String coachAge;
	private String coachNationality;
	
	public Coach () {
		
	}

	public Coach(String leagueName, String teamName, int ranking, String star, String coachName, String coachAge, String coachNationality) {
		super(leagueName, teamName, ranking, star);
		this.coachName = coachName;
		this.coachAge = coachAge;
		this.coachNationality = coachNationality;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getCoachAge() {
		return coachAge;
	}

	public void setCoachAge(String coachAge) {
		this.coachAge = coachAge;
	}

	public String getCoachNationality() {
		return coachNationality;
	}

	public void setCoachNationality(String coachNationality) {
		this.coachNationality = coachNationality;
	}

	@Override
	public String toString() {
		return "Coach [coachName=" + coachName + ", coachAge=" + coachAge + ", coachNationality=" + coachNationality
				+ ", leagueName=" + leagueName + ", teamName=" + teamName + ", ranking=" + ranking + ", starPlayer="
				+ star + "]";
	}
	
	
	public void showInfo() {
		
		System.out.println("리그명: " + leagueName +  " 소속팀: " + teamName + " 순위: " + ranking + " 대표선수 :" + star
				+ " 감독명: " + coachName + " 나이: " + coachAge + " 국적: " + coachNationality );
		System.out.println("=======================================================================================");
	}
	
	
	
	
	
	
	
	
	
}
