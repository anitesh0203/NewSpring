package com.springdemp;

import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		coach volleyBallCoach= context.getBean("volley",coach.class);
		volleyBallCoach.getDailyWorkout();
		
		
		
	}

}
