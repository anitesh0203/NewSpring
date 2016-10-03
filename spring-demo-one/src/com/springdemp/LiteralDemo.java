package com.springdemp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LiteralDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Hockey hockeyCoach=context.getBean("hockey",Hockey.class);
		System.out.println(hockeyCoach.getTeamLocation());
		System.out.println(hockeyCoach.getTeamName());
	}

}
