package com.springdemp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHellloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		coach theCoach=context.getBean("myCoach",coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
		
		ClassPathXmlApplicationContext context1=new ClassPathXmlApplicationContext("applicationContext.xml");
		coach theCoach1=context1.getBean("cricCoach",coach.class);
		System.out.println(theCoach1.getDailyWorkout());
	}

}
