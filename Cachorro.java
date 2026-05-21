package vet;

public class Cachorro {
	String nome;
	String raca;
	int idade;
	boolean faminto = true;

	public void comer() {
		if (faminto == true) {
			System.out.println("O " + nome + " comeu!");
		} else {
			System.out.println(nome + "já está satisfeito.");
		}
	}

	public void latir() {
		System.out.println("O " + raca + " chamado " + nome + " diz \"AU AU!\"");
	}
	
	public void exibirDados() {
		System.out.println("Dados do cachorro:\n Nome:" + nome + "\nRaça: " + raca + "\nIdade: " + idade + " anos"); 
	}

}

