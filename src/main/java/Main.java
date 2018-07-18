import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import builder.Unit;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Unit warriorUnit = (Unit) context.getBean("warrior_unit3");
		
		warriorUnit.show();
		warriorUnit.say("Hello");
		warriorUnit.testActions();
	}

}
