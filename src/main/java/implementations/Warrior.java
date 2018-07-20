package implementations;

import org.springframework.beans.factory.InitializingBean;

import interfaces.IPerson;

public class Warrior implements IPerson, InitializingBean {

	
	public void goTo(int _x, int _y) {
		
		System.out.printf("Run to %d; %d\n", _x, _y);
	}

	public void afterPropertiesSet() throws Exception {
		//
		//System.out.println("init " + this.toString());
	}

}
