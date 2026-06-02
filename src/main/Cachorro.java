package main;

public class Cachorro {
	private String nome;
	private String raca;
	private int idade = 0;
	private char genero;
	private boolean faminto = true;
    private static int totalCachorros = 0; 
	private Cliente dono; 
	
	Cachorro(String nome, String raca, int idade, char genero) {
		if (idade < 0) {
			System.out.println("Por favor, digite uma idade válida para o animal.");
		} else {
			this.idade = idade;
		}
		this.nome = nome;
		this.raca = raca; 
		this.genero = genero; 
		totalCachorros++; 
		
	};
	
	
// getters e setters bonetti etti =======================================
	
	// nome
	public void setNome(String nome) {
		if(nome == ""  || nome == null) {
			System.out.println("Por favor, digite um nome válido.");
		}	else {
			this.nome = nome;
		}
	}
	public String getNome() {
		return this.nome; 
	}
	
	// raça 
	
	public void setRaca(String raca) {
		if(raca == ""  || raca == null) {
			System.out.println("Por favor, digite uma raça válida.");
		}	else {
			this.raca = raca;
		}
	}
	
	public String getRaca() {
		return this.raca; 
	}
	
	// idade 
	public void setIdade(int idade) {
		if(idade < 0) {
			System.out.println("Por favor, digite uma idade válida.");
		}	else {
			this.idade = idade;
		}
	}
	public int getIdade() {
		return this.idade;
	}
	
	// gênero dos auaus
	public void setGenero(char genero) {
		if(genero == ' ') {
			System.out.println("Por favor, digite F para fêmea e M para macho.");
		}	else {
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
		} } else {
			System.out.println(nome + " está satisfeito.");
		}
	}

	// auau 
	public void latir() {
		if (genero == 'F') {
			System.out.println("A " + raca + " chamada " + nome + " diz \"AU AU!\"");
		} else {
		System.out.println("O " + raca + " chamado " + nome + " diz \"AU AU!\"");
	} } 
	
	// autoexplicativo 
	public void exibirDados() {
		if(dono !=null) {
			dono.exibirInfo();
		}
		
		System.out.println("Dados do cachorro:==========\n Nome: " + nome + "\nRaça: " + raca + "\nGênero: " + genero + "\nIdade: " + idade + " anos"); 
	}

}

