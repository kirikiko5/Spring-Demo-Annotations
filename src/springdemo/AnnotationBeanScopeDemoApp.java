package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach tennisCoach2 = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (tennisCoach == tennisCoach2);
		
		System.out.println(result);
		
		context.close();
	}

}
