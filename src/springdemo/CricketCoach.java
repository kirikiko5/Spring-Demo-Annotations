package springdemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	public String getDailyWorkOut() {
		return "Vaya hombre!";
	}
	
	public String getDailyFortune() {
		return null;
	}
}
