package com.odoc.ex07;

public class Son {

	private String name;
	private int season;
	private int stat;

	public Son(String name, int season, int stat) {
		
		this.name = name;
		this.season = season;
		this.stat = stat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public int getStat() {
		return stat;
	}

	public void setStat(int stat) {
		this.stat = stat;
	}

	@Override
	public boolean equals(Object obj) {

		if (this.name == ((Son)obj).name) {

			return true;
			
		} else {
		
			return false;
			
		}

	}

}
