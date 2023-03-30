package sdy.autowiring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Sugar {

	public Sugar() {
		System.out.println("Sugar()");
	}

	@Override
	public String toString() {
		return "Sugar";
	}

}
