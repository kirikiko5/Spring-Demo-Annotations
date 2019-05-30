package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from the spring container
		//Coach theCoach = context.getBean("tennisCoach", Coach.class);
		//Coach anotherCoach = context.getBean("cricketCoach", Coach.class);
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		//call	a method on the bean
		//System.out.println(theCoach.getDailyWorkOut());
		//System.out.println(anotherCoach.getDailyWorkOut());
		System.out.println(tennisCoach.getDailyFortune());
		
		
		//call a method to fget the daily fortune
		//System.out.println(theCoach.getDailyFortune());
		
		//close de container
		context.close();
	}

}
