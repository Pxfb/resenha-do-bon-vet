package main;

public class Gato extends Animal {

	protected boolean arranhaMoveis;
	private static int totalGatos = 0;

	Gato(String nome, int idade, char genero, boolean arranhaMoveis) {
		super(nome, idade, genero);
		this.arranhaMoveis = arranhaMoveis;
		totalGatos++;
	};

	@Override
	public void emitirSom() {
		if (genero == 'F') {
			System.out.println("A " + nome + " disse \"Miau!\"");
		} else {
			System.out.println("O " + nome + " disse \"Miau!\"");
		}
	}

	public static int gettotalGatos() {
		return totalGatos;
	}

}
