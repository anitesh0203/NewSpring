package com.springdemp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("bean-scope.xml");
		CricketCoach cc=context.getBean("cricCoach",CricketCoach.class);
		CricketCoach ccc=context.getBean("cricCoach",CricketCoach.class);
		boolean result=(cc==ccc);
		System.out.println("they are equal"+result);
        context.close(); 		

	}

}
