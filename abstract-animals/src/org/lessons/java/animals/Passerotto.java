package org.lessons.java.animals;

public class Passerotto extends Animale {

	public Passerotto(String nome) {
		super(nome);
	}

	@Override
	public void verso() {
		System.out.println("cip cip");
	}

	@Override
	public void mangia() {
		System.out.println("frutta, semi, pastoncini all'uovo o sfarinati, uovo fresco");
	}

}
