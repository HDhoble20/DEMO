package com.app.commons;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Primary
//@Scope("prototype")
public class CricketCoach implements Coach{
	
	@Value("${coach.name}")
	private String name;
	@Value("${coach.age}")
	private int age;
	
	public CricketCoach() {
		System.out.println("In default of Cricket");
	}
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Bowling "+name+" Age: "+age;
	}

	  @PostConstruct public void initProcess() {
		  System.out.println("Custom Init Method : "+getClass().getSimpleName()); }
		  
		
		  @PreDestroy public void onDestroy() {
		  System.out.println("Custom Destroy Method : "); }
		 



}
