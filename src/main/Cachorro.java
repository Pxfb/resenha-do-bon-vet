package main;

public class Cachorro {
	String nome;
	String raca;
	int idade;
	char genero;
	boolean faminto = true;
	Cliente dono; 

	public void comer() {
		if (faminto == true) {
			if (genero == 'F') {
				System.out.println("A " + nome + " comeu!");
			} else {
			System.out.println("O " + nome + " comeu!");
		} } else {
			System.out.println(nome + " está satisfeito.");
		}
	}

	public void latir() {
		if (genero == 'F') {
			System.out.println("A " + raca + " chamada " + nome + " diz \"AU AU!\"");
		} else {
		System.out.println("O " + raca + " chamado " + nome + " diz \"AU AU!\"");
	} } 
	
	public void exibirDados() {
		if(dono !=null) {
			dono.exibirInfo();
		}
		
		System.out.println("Dados do cachorro:\n Nome: " + nome + "\nRaça: " + raca + "\nIdade: " + idade + " anos"); 
	}

}

