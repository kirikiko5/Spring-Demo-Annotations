package springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	//define my init method
	@PostConstruct
	public void doMyStartUpStuff () {
		System.out.println("Inside init method: do my start up stuff");
	}
	
	
	@PreDestroy
	public void doMyCleanStuffMethod() {
		System.out.println("Inside my destroy method: do my clean up stuff");
	}
	//define my destroy method
	
	
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	public TennisCoach() {
	}
	
	/*
	@Autowired
	public void doCrazyStuff(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkOut() {
		return "Practice your drive";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
