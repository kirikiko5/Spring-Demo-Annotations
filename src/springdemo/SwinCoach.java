package springdemo;

public class SwinCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwinCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Nada hacia arriba";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
