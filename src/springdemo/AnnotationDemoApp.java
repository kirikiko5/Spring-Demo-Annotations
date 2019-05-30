package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
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
