package entities;

import interfaces_.Aves;
import model.Animal;

public class Pato extends Animal implements Aves {
	
	private String corPena;
	
	public Pato(int idade, double tamanho, String corPena) {
		super(idade, tamanho);
		this.corPena = corPena;
	}


	@Override
	public void botarOvos() {
		System.out.println("O pato bota ovos");
	}
	
	public void voar() {
		System.out.println("O pato pode voar");
	}

	@Override
	public void somEmitido() {
		System.out.println("O som emitido é um grasnido.");
	}
	
	@Override
	public String toString() {
		return super.toString()
			+ " Cor da pena: " + corPena;
	}



}
