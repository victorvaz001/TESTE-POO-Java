package entities;

import interfaces_.Aves;
import model.Animal;

public class Galinha extends Animal implements Aves {

	private String corPena;

	public Galinha(int idade, double tamanho, String corPena) {
		super(idade, tamanho);
		this.corPena = corPena;
	}
	

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	public void botarOvos() {
		System.out.println("A galinha bota ovos");
	}

	@Override
	public void somEmitido() {
		System.out.println("O som emitido é um cacarejo");
	}

	@Override
	public String toString() {
		return super.toString() + " Cor da pena: " + corPena;
	}

}
