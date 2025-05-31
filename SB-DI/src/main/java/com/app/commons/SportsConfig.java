package com.app.commons;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {

	@Bean(name = "theBaseBallCoach")
	BaseBallCoach baseBallCoach()
	{
		return new BaseBallCoach();
	}
	
}
