package com.springdemp;

import java.util.Random;

public class ReportEvent implements DailyReport {
private String []report;



	public String getReport() {
		System.out.println("inside the get report segment");
		int idx= new Random().nextInt(report.length);
		System.out.println(idx);
		return report[idx];
}



public void setReport(String []report) {
	System.out.println("setting the property");
	
	this.report=report;
//System.out.println(report.toString());

//	String report1="anitesh";
//	String report2="swarnava";
//	String report3="krishanu";
//	report[0]=report1;
//	report[1]=report2;
//	report[2]=report3;
	for(int i=0;i<report.length;i++)
	{
		System.out.println(report[i].toString());
	}
	
}



	@Override
	public String report() {
		// TODO Auto-generated method stub
		return "This coach also reports about events";
	}
	
	

}
