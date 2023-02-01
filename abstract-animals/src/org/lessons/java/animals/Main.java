package org.lessons.java.animals;

public class Main {

	public static void main(String[] args) {
		Cane c = new Cane("Cocker");
		Passerotto p = new Passerotto("Domesticus");
		Aquila a = new Aquila("Rapax");
		Delfino d = new Delfino("Capodoglio");

		System.out.println(c.getNome());
		c.dormi();
		c.verso();
		c.mangia();

		System.out.println("-------------");

		System.out.println(p.getNome());
		p.dormi();
		p.verso();
		p.mangia();
		p.vola();

		System.out.println("-------------");

		System.out.println(a.getNome());
		a.dormi();
		a.verso();
		a.mangia();
		a.vola();

		System.out.println("-------------");

		System.out.println(d.getNome());
		d.dormi();
		d.verso();
		d.mangia();
		d.nuota();
	}

}
