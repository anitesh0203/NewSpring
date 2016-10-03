package com.springdemp;

public class CricketCoach implements coach{

//ReportEvent reportEvent=new ReportEvent();	
//public CricketCoach(ReportEvent reportEvent)// to make and supply the object is not reponsibillity of the code it has bee taken care by the container 
//{
//	this.reportEvent=reportEvent;
//	System.out.println(this.reportEvent.report());
//}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Iam a cricket coach";
	}
	
	public void start()
	{
		System.out.println("the cycle has just been started");
	}
	public void end()
	{
		System.out.println("the cycle has just ended");
	}

}
