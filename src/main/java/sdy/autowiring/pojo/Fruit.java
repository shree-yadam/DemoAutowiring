package sdy.autowiring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Fruit {
	
	public Fruit() {
		System.out.println("Fruit()");
	}

	@Override
	public String toString() {
		return "Fruit";
	}

}
