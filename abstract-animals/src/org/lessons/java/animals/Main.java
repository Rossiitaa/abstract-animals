package org.lessons.java.animals;

public class Main {

	public static void main(String[] args) {
		Cane c = new Cane("Cocker");
		c.dormi();
		c.verso();
		c.mangia();
		System.out.println("-------------");

		Passerotto p = new Passerotto("Domesticus");
		p.dormi();
		p.verso();
		p.mangia();

		System.out.println("-------------");

		Aquila a = new Aquila("Rapax");
		a.dormi();
		a.verso();
		a.mangia();

		System.out.println("-------------");

		Delfino d = new Delfino("Capodoglio");
		d.dormi();
		d.verso();
		d.mangia();
	}
}
