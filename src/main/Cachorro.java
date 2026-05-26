package main;

public class Cachorro {
	String nome;
	String raca;
	int idade;
	boolean faminto = true;
	Cliente dono; 

	public void comer() {
		if (faminto == true) {
			System.out.println("O " + nome + " comeu!");
		} else {
			System.out.println(nome + " está satisfeito.");
		}
	}

	public void latir() {
		System.out.println("O " + raca + " chamado " + nome + " diz \"AU AU!\"");
	}
	
	public void exibirDados() {
		if(dono !=null) {
			dono.exibirInfo();
		}
		
		System.out.println("Dados do cachorro:\n Nome: " + nome + "\nRaça: " + raca + "\nIdade: " + idade + " anos"); 
	}

}

