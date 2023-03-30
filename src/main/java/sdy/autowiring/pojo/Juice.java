package sdy.autowiring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Juice {
	
	@Autowired
	private Fruit fruit;
	
	@Autowired
	private Sugar sugar;

	public Juice() {
		System.out.println("Juice()");
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public Sugar getSugar() {
		return sugar;
	}

	public void setSugar(Sugar sugar) {
		this.sugar = sugar;
	}

	@Override
	public String toString() {
		return "Juice [fruit=" + fruit + ", sugar=" + sugar + "]";
	}

}
