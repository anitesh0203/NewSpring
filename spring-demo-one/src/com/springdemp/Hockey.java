package com.springdemp;

public class Hockey implements coach {

	private String teamName;
	private String teamLocation;
	
	
	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		System.out.println("setting the team name");
		this.teamName = teamName;
	}


	public String getTeamLocation() {
		return teamLocation;
	}


	public void setTeamLocation(String teamLocation) {
		System.out.println("setting the team location");
		this.teamLocation = teamLocation;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Iam a hockey coach !!";
	}

}
