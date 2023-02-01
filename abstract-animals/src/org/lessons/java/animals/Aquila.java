package org.lessons.java.animals;

public class Aquila extends Animale {

	public Aquila(String nome) {
		super(nome);
	}

	@Override
	public void verso() {
		System.out.println("gridono o stridono");
	}

	@Override
	public void mangia() {
		System.out.println("vari tipi di animali");
	}

}
