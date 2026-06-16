package main;

public class Cachorro extends Animal implements AtendivelNoEstetica {

	private String raca;
	private static int totalCachorros = 0;

	Cachorro(String nome, String raca, int idade, char genero) {
		super(nome, idade, genero);
		this.raca = raca;
		totalCachorros++;
	};

// getters e setters bonetti etti =======================================

	// raça

	public void setRaca(String raca) {
		if (raca == "" || raca == null) {
			System.out.println("Por favor, digite uma raça válida.");
		} else {
			this.raca = raca;
		}
	}

	public String getRaca() {
		return this.raca;
	}

	// total cachorros
	public static int gettotalCachorros() {
		return totalCachorros;
	}

	// métodos bonetti etti =========================================

	// nhami nhami
	public void comer() {
		if (faminto == true) {
			if (genero == 'F') {
				System.out.println("A " + nome + " comeu!");
			} else {
				System.out.println("O " + nome + " comeu!");
			}
		} else {
			System.out.println(nome + " está satisfeito.");
		}
	}

	// auau
	@Override
	public void emitirSom() {
		if (genero == 'F') {
			System.out.println("A " + nome + " disse \"AU AU!\"");
		} else {
			System.out.println("O " + nome + " disse \"AU AU!\"");
		}
	}

	@Override
	public void darBanho() {
		if (genero == 'F') {
			System.out.println("A " + nome + " tomou banho!");
		} else {
			System.out.println("O " + nome + " tomou banho!");
		}
	};

	public void cortarUnhas() {
		if (genero == 'F') {
			System.out.println("A " + nome + " cortou as unhas!");
		} else {
			System.out.println("O " + nome + " cortou as unhas!");
		}
	};

}
