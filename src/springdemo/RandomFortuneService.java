package springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//array of strings
	private String[] data = {
			"Ola k ase",
			"España vs Zimbabwe",
			"La mochiiiiiillo"
	};
	
	//random generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
