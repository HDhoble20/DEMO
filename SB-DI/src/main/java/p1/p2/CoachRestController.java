package p1.p2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.commons.Coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@RestController
@RequestMapping("/api")
public class CoachRestController {
	
	//@Autowired
	private Coach coach;
	private Coach theCoach;

	
	  //@Autowired 
		/*
		 * public CoachRestController(@Qualifier("theBaseBallCoach") Coach coach) {
		 * super(); System.out.println("In Parameterized "); this.coach = coach; }
		 */
	 
	
	//@Autowired
	
	  public CoachRestController(@Qualifier("cricketCoach") Coach coach) {
	   super();
	  System.out.println("In Parameterized "); 
	  this.coach = coach; }
	 
	
	/*
	 * public CoachRestController(Coach coach,Coach theCoach) { super();
	 * System.out.println("In Parameterized "); this.coach = coach; this.theCoach =
	 * theCoach; }
	 */
	 
	//@Autowired
	public void setCoach(Coach coach) {
		System.out.println("In Setters");
		this.coach = coach;
	}
	
	//@Autowired
	public void doStuff(Coach coach) {
		System.out.println("In Set");
		this.coach = coach;
	}


	@GetMapping("/dailyWorkout")
	public String getDailyWorkout()
	{
		return coach.getDailyWorkout()+" coach == theCoach : "+(coach==theCoach);
	}
	

	  @PostConstruct public void initProcess() {
		  System.out.println("Custom Init Method : "+getClass().getSimpleName()); }
		  
		  @PreDestroy 
		  public void onDestroy() {
		  System.out.println("Custom Destroy Method : ");
		  }
	 
	
	
}
