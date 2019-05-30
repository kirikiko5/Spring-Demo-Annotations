package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
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
