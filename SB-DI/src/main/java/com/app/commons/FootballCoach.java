package com.app.commons;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class FootballCoach implements Coach {
	
	public FootballCoach()
	{
		System.out.println("In football");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Perform Stretch";
	}

}
