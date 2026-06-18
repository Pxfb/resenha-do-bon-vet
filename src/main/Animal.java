package main;

public abstract class Animal {

	protected String nome;
	protected int idade = 0;
	protected char genero;
	protected boolean faminto = true;

	protected static int totalAnimais = 0;
	protected Cliente dono;

	Animal(String nome, int idade, char genero) {
		if (idade < 0) {
			System.out.println("Por favor, digite uma idade válida para o animal.");
		} else {
			this.idade = idade;
		}
		this.nome = nome;
		this.genero = genero;
		totalAnimais++;

	};

	// Os getters e setters do bonetti etti

	// nome
	public void setNome(String nome) {
		if (nome == "" || nome == null) {
			System.out.println("Por favor, digite um nome v�lido.");
		} else {
			this.nome = nome;
		}
	}

	public String getNome() {
		return this.nome;
	}

	// idade
	public void setIdade(int idade) {
		if (idade < 0) {
			System.out.println("Por favor, digite uma idade v�lida.");
		} else {
			this.idade = idade;
		}
	}

	public int getIdade() {
		return this.idade;
	}

	// gêneros dos animais
	public void setGenero(char genero) {
		if (genero == ' ') {
			System.out.println("Por favor, digite F para f�mea e M para macho.");
		} else {
			this.genero = genero;
		}
	}

	public char getGenero() {
		return this.genero;
	}

	// faminto

	public boolean getFaminto() {
		return this.faminto;
	}

	// dono
	public void setDono(Cliente dono) {
		this.dono = dono;
	}
	public Cliente getDono() {
		return this.dono;
	}
	// metodinhos dos
	// animaiszinhos==========================================================================
	public abstract void emitirSom();

	// get total
	// animaizes==========================================================================
	public static int gettotalAnimais() {
		return totalAnimais;
	}

// autoexplicativo 
	public String exibirDados() {
		if (dono != null) {
			dono.exibirInfo();
		}

		System.out.println(
				"Dados do Animal:==========\n Nome: " + nome + "\nG�nero: " + genero + "\nIdade: " + idade + " anos");
		return "Dados do Animal:==========\n Nome: " + nome + "\nG�nero: " + genero + "\nIdade: " + idade + " anos";
	}
}
