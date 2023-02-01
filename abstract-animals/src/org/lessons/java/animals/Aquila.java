package org.lessons.java.animals;

public class Aquila extends Animale implements IVolante {

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

	@Override
	public void vola() {
		System.out.println("che bello volare disse " + getNome());
	}
}
