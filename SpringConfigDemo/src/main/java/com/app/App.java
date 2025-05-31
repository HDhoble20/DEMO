package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.utility.Coach;

public class App {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext context =
    		   new AnnotationConfigApplicationContext(SpringConfig.class);
      // Coach coach = context.getBean("tennisCoach",Coach.class);
       Coach coach = context.getBean("cricket",Coach.class);
       System.out.println(coach.getDailyWorkout());
       System.out.println(coach.getFortuneService());
       context.close();
    }
}
