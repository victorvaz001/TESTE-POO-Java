package teste;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Galinha;
import entities.Morcego;
import entities.Pato;
import entities.Vaca;

public class Program {

	public static void main(String[] args) {

		//Locale.setDefault(Locale.US);//caso queira digitar com o (.)

		Scanner sc = new Scanner(System.in);

		int idade;
		double tamanho;
		String corPenaGlinha;
		String corPenaPato;
		String corPeloVaca;
		String corPeloMorcego;

		System.out.println("INFORME OS DADOS DAS AVES!");
		System.out.println();

		System.out.print("Digite a idade do pato: ");
		idade = sc.nextInt();
		
		try {
		System.out.print("Digite o tamanho do pato: ");
		tamanho = sc.nextDouble();
		

		System.out.print("Digite a cor da pena do pato: ");
		sc.nextLine();
		corPenaPato = sc.nextLine();

		Pato pato = new Pato(idade, tamanho, corPenaPato);
		
	

		System.out.println();
		System.out.print("Digite a idade da galinha: ");
		idade = sc.nextInt();
		System.out.print("Digite o tamanho da galinha: ");
		tamanho = sc.nextDouble();
		System.out.print("Digite a cor da pena da galinha: ");
		sc.nextLine();
		corPenaGlinha = sc.nextLine();

		Galinha galinha = new Galinha(idade, tamanho, corPenaGlinha);

		System.out.println();
		System.out.println("INFORME OS DADOS DOS MAMÍFEROS!");
		System.out.println();

		System.out.print("Digite a idade da vaca: ");
		idade = sc.nextInt();
		System.out.print("Digite o tamanho da vaca: ");
		tamanho = sc.nextDouble();
		System.out.print("Digite a cor do pelo da vaca: ");
		sc.nextLine();
		corPeloVaca = sc.nextLine();

		Vaca vaca = new Vaca(idade, tamanho, corPeloVaca);

		System.out.println();
		System.out.print("Digite a idade do morcego: ");
		idade = sc.nextInt();
		System.out.print("Digite o tamanho do morcego: ");
		tamanho = sc.nextDouble();
		System.out.print("Digite a cor do pelo do morcego: ");
		sc.nextLine();
		corPeloMorcego = sc.nextLine();

		Morcego morcego = new Morcego(idade, tamanho, corPeloMorcego);

		System.out.println();
		System.out.println("DADOS DO PATO: ");
		System.out.println(pato);
		pato.voar();
		pato.somEmitido();
		pato.botarOvos();

		System.out.println("------------------------");
		System.out.println("DADOS DA GALINHA: ");
		System.out.println(galinha);
		galinha.botarOvos();
		galinha.somEmitido();

		System.out.println("------------------------");
		System.out.println("DADOS DA VACA: ");
		System.out.println(vaca);
		vaca.somEmitido();
		vaca.amamentar();

		System.out.println("------------------------");
		System.out.println("DADOS DO MORCEGO: ");
		System.out.println(morcego);
		morcego.somEmitido();
		morcego.voar();
		morcego.amamentar();
		
	}catch(InputMismatchException e) {
			System.out.println("Favor não digitar ponto, caso queire descomente a linha 15");
	}

	}

}
