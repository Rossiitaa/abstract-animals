package org.lessons.java.animals;

public class Delfino extends Animale implements INuotante {

	public Delfino(String nome) {
		super(nome);
	}

	@Override
	public void verso() {
		System.out.println("usano i fischi");
	}

	@Override
	public void mangia() {
		System.out.println("Pesce, crostacei, calamari");
	}

	@Override
	public void nuota() {
		System.out.println("che bello nuotare disse " + getNome());
	}

}
