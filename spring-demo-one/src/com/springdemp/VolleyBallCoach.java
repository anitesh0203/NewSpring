package com.springdemp;

public class VolleyBallCoach implements coach {

	
	private DailyReport dailyReport;
	@Override
	public String getDailyWorkout() {
		return "lets play volleyball";
	}
	public void setDailyReport(DailyReport dailyReport) {
		System.out.println("inside the setter method");
		this.dailyReport = dailyReport;
	}
	public VolleyBallCoach() {
		System.out.println("inside the constructor:volleyball coach");
	}
	public String getDailyReport(){
		return	dailyReport.report();
	}
}
