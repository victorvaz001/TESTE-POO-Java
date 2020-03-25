package entities;

import interfaces_.Mamifero;
import model.Animal;

public class Morcego extends Animal implements Mamifero {

	private String corPelo;

	public Morcego(int idade, double tamanho, String corPelo) {
		super(idade, tamanho);
		this.corPelo = corPelo;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void somEmitido() {
		System.out.println("O som emitido é um farfalho.");
	}

	public void voar() {
		System.out.println("O morcego pode voar.");
	}

	@Override
	public void amamentar() {
		System.out.println("O morcego amamenta");
	}

	@Override
	public String toString() {
		return super.toString() + " Cor do pelo: " + corPelo;
	}

}
