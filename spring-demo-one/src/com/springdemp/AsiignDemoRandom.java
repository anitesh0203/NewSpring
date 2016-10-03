package com.springdemp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AsiignDemoRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		ReportEvent report=context.getBean("reportInt",ReportEvent.class);
		System.out.println(report.getReport());


	}

}
