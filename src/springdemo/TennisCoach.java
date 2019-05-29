package springdemo;

import org.springframework.stereotype.Component;

@Component("bestCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		return "Practice your drive";
	}

}
