package main;

public class Cliente {
	private String nome;
	private String telefone;
	
	Cliente(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}
	
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
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return this.telefone;
	
	} 
	
	
	public void exibirInfo() {
		System.out.println("Dados do dono:==========\n Nome: " + nome + "\n Telefone: " + telefone);
	}
}
